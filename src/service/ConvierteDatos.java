package service;

import modelo.TasaDeConversion;
import modelo.TasaDeConversionApi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvierteDatos {

    public TasaDeConversionApi convierteDatos(String json){

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();

        TasaDeConversionApi tasaDeConversionApi = gson.fromJson(json, TasaDeConversionApi.class);

        TasaDeConversion tasaDeConversion = new TasaDeConversion(tasaDeConversionApi);

        return tasaDeConversionApi;

    }

}