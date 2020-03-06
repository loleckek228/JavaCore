package professionalLevel.lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TryTest {
    public static void main(String[] args) throws Exception {
        Class c = Methods.class;
        start(c);
    }

    public static void start(Class testClass) {
        Method[] methods = testClass.getDeclaredMethods();
        TreeMap<Integer, List<Method>> mapMethods = new TreeMap<>();

        ArrayList<Method> beforeSuiteMethods = new ArrayList<>();
        ArrayList<Method> afterSuiteMethods = new ArrayList<>();

        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteMethods.add(m);
            }

            if (m.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteMethods.add(m);
            }

            if (m.isAnnotationPresent(Test.class)) {
                Integer priority = getPriority(m);

                List<Method> methodList = mapMethods.getOrDefault(priority, new ArrayList<>());
                methodList.add(m);

                mapMethods.put(priority, methodList);
            }
        }

        if (beforeSuiteMethods.size() > 1) {
            throw new RuntimeException("Методов с аннотацией BeforeSuite больше одного");
        }

        if (afterSuiteMethods.size() > 1) {
            throw new RuntimeException("Методов с аннотацией AfterSuite больше одного");
        }

        ArrayList<Integer> keys = new ArrayList<>(mapMethods.keySet());

        invokeMethods(beforeSuiteMethods);

        for (int i = keys.size() - 1; i >= 0; i--) {
            invokeMethods(mapMethods.get(keys.get(i)));
        }

        invokeMethods(afterSuiteMethods);
    }

    private static Integer getPriority(Method m) {
        Integer priority = m.getAnnotation(Test.class).priority();

        if (priority > 10) priority = 10;
        else if (priority <= 0) priority = 1;
        return priority;
    }

    private static void invokeMethods(List<Method> method) {
        method.forEach(m -> {
            try {
                m.invoke(null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}