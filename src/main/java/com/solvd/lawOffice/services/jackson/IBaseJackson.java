package com.solvd.lawOffice.services.jackson;

import java.io.File;
import java.util.List;

public interface IBaseJackson<T> {

    List<T> getJsonList(File file);
}
