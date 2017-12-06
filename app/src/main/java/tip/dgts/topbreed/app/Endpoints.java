package tip.dgts.topbreed.app;

/**
 * @author pocholomia
 * @since 24/01/2017
 */

public class Endpoints {
    //public static final String BASE_URL = "http://10.3.32.201/scheduler";
    private static final String BASE_URL = "http://scheduler.dgts.ph";


    static final String API_URL = BASE_URL + "/api/";

    public static final String ID = "{id}";


    //Credentials
    public static final String LOGIN = "admin/login";
    public static final String REGISTER = "user";
    public static final String CHANGE_PASSWORD = "user/changepass";
    public static final String UPDATE_ACCOUNT = "user/updateacct";
    public static final String FORGOT_PASSWORD = "user/forgotpass/{email_address}";
    public static final String LOGOUT = "user/logout";




}
