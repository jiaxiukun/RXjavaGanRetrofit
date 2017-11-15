package baway.com.rxjavaganretrofit;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by 贾秀坤 on 2017/11/15.
 */

public class WeatherEntity {

    /**
     * data : {"yesterday":{"date":"14日星期二","high":"高温 8℃","fx":"西北风","low":"低温 -4℃","fl":"<![CDATA[<3级]]>","type":"晴"},"city":"北京","aqi":"41","forecast":[{"date":"15日星期三","high":"高温 7℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"东北风","type":"晴"},{"date":"16日星期四","high":"高温 8℃","fengli":"<![CDATA[<3级]]>","low":"低温 -2℃","fengxiang":"南风","type":"晴"},{"date":"17日星期五","high":"高温 7℃","fengli":"<![CDATA[4-5级]]>","low":"低温 -4℃","fengxiang":"无持续风向","type":"阴"},{"date":"18日星期六","high":"高温 5℃","fengli":"<![CDATA[<3级]]>","low":"低温 -5℃","fengxiang":"西南风","type":"晴"},{"date":"19日星期天","high":"高温 8℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"西南风","type":"多云"}],"ganmao":"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。","wendu":"3"}
     * status : 1000
     * desc : OK
     */

    private DataBean data;
    private int status;
    private String desc;

    public static WeatherEntity objectFromData(String str) {

        return new Gson().fromJson(str, WeatherEntity.class);
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"14日星期二","high":"高温 8℃","fx":"西北风","low":"低温 -4℃","fl":"<![CDATA[<3级]]>","type":"晴"}
         * city : 北京
         * aqi : 41
         * forecast : [{"date":"15日星期三","high":"高温 7℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"东北风","type":"晴"},{"date":"16日星期四","high":"高温 8℃","fengli":"<![CDATA[<3级]]>","low":"低温 -2℃","fengxiang":"南风","type":"晴"},{"date":"17日星期五","high":"高温 7℃","fengli":"<![CDATA[4-5级]]>","low":"低温 -4℃","fengxiang":"无持续风向","type":"阴"},{"date":"18日星期六","high":"高温 5℃","fengli":"<![CDATA[<3级]]>","low":"低温 -5℃","fengxiang":"西南风","type":"晴"},{"date":"19日星期天","high":"高温 8℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"西南风","type":"多云"}]
         * ganmao : 天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。
         * wendu : 3
         */

        private YesterdayBean yesterday;
        private String city;
        private String aqi;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 14日星期二
             * high : 高温 8℃
             * fx : 西北风
             * low : 低温 -4℃
             * fl : <![CDATA[<3级]]>
             * type : 晴
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public static YesterdayBean objectFromData(String str) {

                return new Gson().fromJson(str, YesterdayBean.class);
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 15日星期三
             * high : 高温 7℃
             * fengli : <![CDATA[<3级]]>
             * low : 低温 -3℃
             * fengxiang : 东北风
             * type : 晴
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public static ForecastBean objectFromData(String str) {

                return new Gson().fromJson(str, ForecastBean.class);
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
