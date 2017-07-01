package com.xikai.Exception;

/**
 * Created by xikaixiong on 2/26/17.
 */
//@ControllerAdvice
//public class GlobalExceptionHandlerMethods {
//    @ExceptionHandler(value = NullPointerException.class)
//    public String handNULLPointerException(Exception ex) {
//        System.out.println("Null pointer exception occured: " + ex);
//        //this name must be the same as exception jsp name, in this case is NullPointerException
//        return "NullPointerException ";
//    }
//
//    @ExceptionHandler(value = IOException.class)
//    public String handleIOException(Exception ex) {
//        System.out.println("IO Exception occured: " + ex);
//        return "IOException";
//    }
//
//    // once exception become to many, use this generic method to catch those exceptions
//
//    @ExceptionHandler(value = Exception.class)
//    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
//    public String handleException(Exception ex) {
//        System.out.println("Unknow exception occured: " + ex);
//        return "Exception";
//    }
//}
