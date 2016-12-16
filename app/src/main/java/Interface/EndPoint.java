package Interface;

import Models.Root;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by draffe on 14/12/2016.
 */
public interface EndPoint {

    @GET("reddits.json")
    Call<Root> getRappidJson();

}
