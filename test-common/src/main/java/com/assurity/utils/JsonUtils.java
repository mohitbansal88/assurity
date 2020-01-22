package com.assurity.utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class JsonUtils {
  private static final Logger LOG = LoggerFactory.getLogger(JsonUtils.class);
  private static ObjectMapper objectMapper = new ObjectMapper();

  public static <T> T getDto(String json, Class<T> classType) {
    T dto = null;
    try {
      dto = objectMapper.readValue(json, classType);
    } catch (JsonParseException e) {
      LOG.error("Unable to parse jsonString to dto. Invalid type content: ", e);
    } catch (JsonMappingException e) {
      LOG.error("JsonString does not match with Dto: ", e);
    } catch (IOException e) {
      LOG.error("Unable to parse string to dto: ", e);
    }
    return dto;
  }

}
