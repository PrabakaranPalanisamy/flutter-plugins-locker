// Autogenerated from Pigeon (v17.3.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.example.flutter_locker

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private fun wrapResult(result: Any?): List<Any?> {
  return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any?> {
  if (exception is FlutterError) {
    return listOf(
      exception.code,
      exception.message,
      exception.details
    )
  } else {
    return listOf(
      exception.javaClass.simpleName,
      exception.toString(),
      "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
    )
  }
}

/**
 * Error class for passing custom error details to Flutter via a thrown PlatformException.
 * @property code The error code.
 * @property message The error message.
 * @property details The error details. Must be a datatype supported by the api codec.
 */
class FlutterError (
  val code: String,
  override val message: String? = null,
  val details: Any? = null
) : Throwable()

/**
 * Data structure for authenticating
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class AuthenticateRequest (
  val key: String,
  val androidPrompt: AndroidPrompt,
  val iOsPrompt: IOsPrompt

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): AuthenticateRequest {
      val key = list[0] as String
      val androidPrompt = AndroidPrompt.fromList(list[1] as List<Any?>)
      val iOsPrompt = IOsPrompt.fromList(list[2] as List<Any?>)
      return AuthenticateRequest(key, androidPrompt, iOsPrompt)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      key,
      androidPrompt.toList(),
      iOsPrompt.toList(),
    )
  }
}

/**
 * Data structure for retrieving the saved secret
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class RetrieveSecretRequest (
  val key: String,
  val androidPrompt: AndroidPrompt,
  val iOsPrompt: IOsPrompt

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): RetrieveSecretRequest {
      val key = list[0] as String
      val androidPrompt = AndroidPrompt.fromList(list[1] as List<Any?>)
      val iOsPrompt = IOsPrompt.fromList(list[2] as List<Any?>)
      return RetrieveSecretRequest(key, androidPrompt, iOsPrompt)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      key,
      androidPrompt.toList(),
      iOsPrompt.toList(),
    )
  }
}

/**
 * Data structure for saving the saved secret
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class SaveSecretRequest (
  val key: String,
  val secret: String,
  val androidPrompt: AndroidPrompt

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): SaveSecretRequest {
      val key = list[0] as String
      val secret = list[1] as String
      val androidPrompt = AndroidPrompt.fromList(list[2] as List<Any?>)
      return SaveSecretRequest(key, secret, androidPrompt)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      key,
      secret,
      androidPrompt.toList(),
    )
  }
}

/**
 * Defines text that's displayed in native OS prompt for authentication
 *
 * title and cancel are required.
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class AndroidPrompt (
  val title: String,
  val cancelLabel: String,
  val descriptionLabel: String? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): AndroidPrompt {
      val title = list[0] as String
      val cancelLabel = list[1] as String
      val descriptionLabel = list[2] as String?
      return AndroidPrompt(title, cancelLabel, descriptionLabel)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      title,
      cancelLabel,
      descriptionLabel,
    )
  }
}

/**
 * The iOS native dialog is only shown when retrieving secret.
 *
 * - For phones with Touch ID, the [touchIdText] is displayed in prompt.
 * - For phones with Face ID, the text is defined in plist file.
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class IOsPrompt (
  val touchIdText: String

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): IOsPrompt {
      val touchIdText = list[0] as String
      return IOsPrompt(touchIdText)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      touchIdText,
    )
  }
}

@Suppress("UNCHECKED_CAST")
private object PigeonApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AndroidPrompt.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AuthenticateRequest.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          IOsPrompt.fromList(it)
        }
      }
      131.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          RetrieveSecretRequest.fromList(it)
        }
      }
      132.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          SaveSecretRequest.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is AndroidPrompt -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is AuthenticateRequest -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is IOsPrompt -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      is RetrieveSecretRequest -> {
        stream.write(131)
        writeValue(stream, value.toList())
      }
      is SaveSecretRequest -> {
        stream.write(132)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface PigeonApi {
  fun canAuthenticate(callback: (Result<Boolean>) -> Unit)
  fun authenticate(request: AuthenticateRequest, callback: (Result<Boolean>) -> Unit)
  fun save(request: SaveSecretRequest, callback: (Result<Unit>) -> Unit)
  fun retrieve(request: RetrieveSecretRequest, callback: (Result<String>) -> Unit)
  fun delete(key: String, callback: (Result<Unit>) -> Unit)

  companion object {
    /** The codec used by PigeonApi. */
    val codec: MessageCodec<Any?> by lazy {
      PigeonApiCodec
    }
    /** Sets up an instance of `PigeonApi` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: PigeonApi?) {
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_locker.PigeonApi.canAuthenticate", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            api.canAuthenticate() { result: Result<Boolean> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_locker.PigeonApi.authenticate", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val requestArg = args[0] as AuthenticateRequest
            api.authenticate(requestArg) { result: Result<Boolean> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_locker.PigeonApi.save", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val requestArg = args[0] as SaveSecretRequest
            api.save(requestArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_locker.PigeonApi.retrieve", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val requestArg = args[0] as RetrieveSecretRequest
            api.retrieve(requestArg) { result: Result<String> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_locker.PigeonApi.delete", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val keyArg = args[0] as String
            api.delete(keyArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}
