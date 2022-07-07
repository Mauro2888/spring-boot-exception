@ControllerAdvice
public class ExceptionControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    @ExceptionHandler(value= { ServiceDownTimeException.class })
    protected ServiceDownTimeException handleConflict(ServiceDownTimeException exception, HttpServletResponse response) {
        return exception;
    }

}
