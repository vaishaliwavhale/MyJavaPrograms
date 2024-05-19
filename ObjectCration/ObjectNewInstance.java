//package ObjectCration;
//import java.lang.reflect.Constructor;
//
//public class ObjectNewCreation {
//    public static void main(String[] args) {
//        try {
//
//            Class<?> clazz = Class.forName("ObjectCration.ObjectNewCreation");
//
//
//            Constructor<?> constructor = clazz.getDeclaredConstructor();
//
//            constructor.setAccessible(true);
//
//            // Create an instance of the class
//            Object object = constructor.newInstance();
//
//            // Now you can use myObject as a normal instance of MyClass
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}