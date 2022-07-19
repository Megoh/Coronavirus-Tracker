package pl.dominik.coronavirustracker.services;

import java.net.http.HttpClient;

public class CoronavirusDataService {
    private static final String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    public void fetchVirusData() {
        HttpClient client = HttpClient.newHttpClient();
    }
}
