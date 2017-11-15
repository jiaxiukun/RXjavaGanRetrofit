package baway.com.rxjavaganretrofit;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 贾秀坤 on 2017/11/15.
 */

public interface GetWeatherService {
    // http://wthrcdn.etouch.cn/weather_mini?city=北京
    @GET("weather_mini")
    rx.Observable<WeatherEntity> getRxMessage(@Query("city") String city);

}
