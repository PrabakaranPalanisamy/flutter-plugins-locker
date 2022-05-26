// Autogenerated from Pigeon (v3.1.2), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.example.flutter_locker;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Pigeon {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class RetrieveSecretRequest {
    private @NonNull String key;
    public @NonNull String getKey() { return key; }
    public void setKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"key\" is null.");
      }
      this.key = setterArg;
    }

    private @NonNull AndroidPrompt androidPrompt;
    public @NonNull AndroidPrompt getAndroidPrompt() { return androidPrompt; }
    public void setAndroidPrompt(@NonNull AndroidPrompt setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"androidPrompt\" is null.");
      }
      this.androidPrompt = setterArg;
    }

    private @NonNull IOsPrompt iOsPrompt;
    public @NonNull IOsPrompt getIOsPrompt() { return iOsPrompt; }
    public void setIOsPrompt(@NonNull IOsPrompt setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"iOsPrompt\" is null.");
      }
      this.iOsPrompt = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private RetrieveSecretRequest() {}
    public static final class Builder {
      private @Nullable String key;
      public @NonNull Builder setKey(@NonNull String setterArg) {
        this.key = setterArg;
        return this;
      }
      private @Nullable AndroidPrompt androidPrompt;
      public @NonNull Builder setAndroidPrompt(@NonNull AndroidPrompt setterArg) {
        this.androidPrompt = setterArg;
        return this;
      }
      private @Nullable IOsPrompt iOsPrompt;
      public @NonNull Builder setIOsPrompt(@NonNull IOsPrompt setterArg) {
        this.iOsPrompt = setterArg;
        return this;
      }
      public @NonNull RetrieveSecretRequest build() {
        RetrieveSecretRequest pigeonReturn = new RetrieveSecretRequest();
        pigeonReturn.setKey(key);
        pigeonReturn.setAndroidPrompt(androidPrompt);
        pigeonReturn.setIOsPrompt(iOsPrompt);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("key", key);
      toMapResult.put("androidPrompt", (androidPrompt == null) ? null : androidPrompt.toMap());
      toMapResult.put("iOsPrompt", (iOsPrompt == null) ? null : iOsPrompt.toMap());
      return toMapResult;
    }
    static @NonNull RetrieveSecretRequest fromMap(@NonNull Map<String, Object> map) {
      RetrieveSecretRequest pigeonResult = new RetrieveSecretRequest();
      Object key = map.get("key");
      pigeonResult.setKey((String)key);
      Object androidPrompt = map.get("androidPrompt");
      pigeonResult.setAndroidPrompt((androidPrompt == null) ? null : AndroidPrompt.fromMap((Map)androidPrompt));
      Object iOsPrompt = map.get("iOsPrompt");
      pigeonResult.setIOsPrompt((iOsPrompt == null) ? null : IOsPrompt.fromMap((Map)iOsPrompt));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SaveSecretRequest {
    private @NonNull String key;
    public @NonNull String getKey() { return key; }
    public void setKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"key\" is null.");
      }
      this.key = setterArg;
    }

    private @NonNull String secret;
    public @NonNull String getSecret() { return secret; }
    public void setSecret(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"secret\" is null.");
      }
      this.secret = setterArg;
    }

    private @NonNull AndroidPrompt androidPrompt;
    public @NonNull AndroidPrompt getAndroidPrompt() { return androidPrompt; }
    public void setAndroidPrompt(@NonNull AndroidPrompt setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"androidPrompt\" is null.");
      }
      this.androidPrompt = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private SaveSecretRequest() {}
    public static final class Builder {
      private @Nullable String key;
      public @NonNull Builder setKey(@NonNull String setterArg) {
        this.key = setterArg;
        return this;
      }
      private @Nullable String secret;
      public @NonNull Builder setSecret(@NonNull String setterArg) {
        this.secret = setterArg;
        return this;
      }
      private @Nullable AndroidPrompt androidPrompt;
      public @NonNull Builder setAndroidPrompt(@NonNull AndroidPrompt setterArg) {
        this.androidPrompt = setterArg;
        return this;
      }
      public @NonNull SaveSecretRequest build() {
        SaveSecretRequest pigeonReturn = new SaveSecretRequest();
        pigeonReturn.setKey(key);
        pigeonReturn.setSecret(secret);
        pigeonReturn.setAndroidPrompt(androidPrompt);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("key", key);
      toMapResult.put("secret", secret);
      toMapResult.put("androidPrompt", (androidPrompt == null) ? null : androidPrompt.toMap());
      return toMapResult;
    }
    static @NonNull SaveSecretRequest fromMap(@NonNull Map<String, Object> map) {
      SaveSecretRequest pigeonResult = new SaveSecretRequest();
      Object key = map.get("key");
      pigeonResult.setKey((String)key);
      Object secret = map.get("secret");
      pigeonResult.setSecret((String)secret);
      Object androidPrompt = map.get("androidPrompt");
      pigeonResult.setAndroidPrompt((androidPrompt == null) ? null : AndroidPrompt.fromMap((Map)androidPrompt));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class AndroidPrompt {
    private @NonNull String title;
    public @NonNull String getTitle() { return title; }
    public void setTitle(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"title\" is null.");
      }
      this.title = setterArg;
    }

    private @NonNull String cancelLabel;
    public @NonNull String getCancelLabel() { return cancelLabel; }
    public void setCancelLabel(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"cancelLabel\" is null.");
      }
      this.cancelLabel = setterArg;
    }

    private @Nullable String description;
    public @Nullable String getDescription() { return description; }
    public void setDescription(@Nullable String setterArg) {
      this.description = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private AndroidPrompt() {}
    public static final class Builder {
      private @Nullable String title;
      public @NonNull Builder setTitle(@NonNull String setterArg) {
        this.title = setterArg;
        return this;
      }
      private @Nullable String cancelLabel;
      public @NonNull Builder setCancelLabel(@NonNull String setterArg) {
        this.cancelLabel = setterArg;
        return this;
      }
      private @Nullable String description;
      public @NonNull Builder setDescription(@Nullable String setterArg) {
        this.description = setterArg;
        return this;
      }
      public @NonNull AndroidPrompt build() {
        AndroidPrompt pigeonReturn = new AndroidPrompt();
        pigeonReturn.setTitle(title);
        pigeonReturn.setCancelLabel(cancelLabel);
        pigeonReturn.setDescription(description);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("title", title);
      toMapResult.put("cancelLabel", cancelLabel);
      toMapResult.put("description", description);
      return toMapResult;
    }
    static @NonNull AndroidPrompt fromMap(@NonNull Map<String, Object> map) {
      AndroidPrompt pigeonResult = new AndroidPrompt();
      Object title = map.get("title");
      pigeonResult.setTitle((String)title);
      Object cancelLabel = map.get("cancelLabel");
      pigeonResult.setCancelLabel((String)cancelLabel);
      Object description = map.get("description");
      pigeonResult.setDescription((String)description);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class IOsPrompt {
    private @NonNull String touchIdText;
    public @NonNull String getTouchIdText() { return touchIdText; }
    public void setTouchIdText(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"touchIdText\" is null.");
      }
      this.touchIdText = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private IOsPrompt() {}
    public static final class Builder {
      private @Nullable String touchIdText;
      public @NonNull Builder setTouchIdText(@NonNull String setterArg) {
        this.touchIdText = setterArg;
        return this;
      }
      public @NonNull IOsPrompt build() {
        IOsPrompt pigeonReturn = new IOsPrompt();
        pigeonReturn.setTouchIdText(touchIdText);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("touchIdText", touchIdText);
      return toMapResult;
    }
    static @NonNull IOsPrompt fromMap(@NonNull Map<String, Object> map) {
      IOsPrompt pigeonResult = new IOsPrompt();
      Object touchIdText = map.get("touchIdText");
      pigeonResult.setTouchIdText((String)touchIdText);
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class PigeonApiCodec extends StandardMessageCodec {
    public static final PigeonApiCodec INSTANCE = new PigeonApiCodec();
    private PigeonApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return AndroidPrompt.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return IOsPrompt.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return RetrieveSecretRequest.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)131:         
          return SaveSecretRequest.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof AndroidPrompt) {
        stream.write(128);
        writeValue(stream, ((AndroidPrompt) value).toMap());
      } else 
      if (value instanceof IOsPrompt) {
        stream.write(129);
        writeValue(stream, ((IOsPrompt) value).toMap());
      } else 
      if (value instanceof RetrieveSecretRequest) {
        stream.write(130);
        writeValue(stream, ((RetrieveSecretRequest) value).toMap());
      } else 
      if (value instanceof SaveSecretRequest) {
        stream.write(131);
        writeValue(stream, ((SaveSecretRequest) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface PigeonApi {
    void canAuthenticate(Result<Boolean> result);
    void save(@NonNull SaveSecretRequest request, Result<Boolean> result);
    void retrieve(@NonNull RetrieveSecretRequest request, Result<String> result);
    void delete(@NonNull String key, Result<Void> result);

    /** The codec used by PigeonApi. */
    static MessageCodec<Object> getCodec() {
      return PigeonApiCodec.INSTANCE;
    }

    /** Sets up an instance of `PigeonApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, PigeonApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PigeonApi.canAuthenticate", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Boolean> resultCallback = new Result<Boolean>() {
                public void success(Boolean result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.canAuthenticate(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PigeonApi.save", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              SaveSecretRequest requestArg = (SaveSecretRequest)args.get(0);
              if (requestArg == null) {
                throw new NullPointerException("requestArg unexpectedly null.");
              }
              Result<Boolean> resultCallback = new Result<Boolean>() {
                public void success(Boolean result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.save(requestArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PigeonApi.retrieve", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              RetrieveSecretRequest requestArg = (RetrieveSecretRequest)args.get(0);
              if (requestArg == null) {
                throw new NullPointerException("requestArg unexpectedly null.");
              }
              Result<String> resultCallback = new Result<String>() {
                public void success(String result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.retrieve(requestArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PigeonApi.delete", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              String keyArg = (String)args.get(0);
              if (keyArg == null) {
                throw new NullPointerException("keyArg unexpectedly null.");
              }
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.delete(keyArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
