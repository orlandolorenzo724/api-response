package it.orlandolorenzo.apiresponse;

public class APIResponseResult {

    private APIResponseResult() {
        throw new IllegalStateException("Utility class");
    }

    protected static final String RESULT_OK = "OK";
    protected static final String RESULT_KO = "KO";
}
