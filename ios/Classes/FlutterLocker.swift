// Autogenerated from Pigeon (v17.3.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

import Foundation

#if os(iOS)
  import Flutter
#elseif os(macOS)
  import FlutterMacOS
#else
  #error("Unsupported platform.")
#endif

private func wrapResult(_ result: Any?) -> [Any?] {
  return [result]
}

private func wrapError(_ error: Any) -> [Any?] {
  if let flutterError = error as? FlutterError {
    return [
      flutterError.code,
      flutterError.message,
      flutterError.details,
    ]
  }
  return [
    "\(error)",
    "\(type(of: error))",
    "Stacktrace: \(Thread.callStackSymbols)",
  ]
}

private func isNullish(_ value: Any?) -> Bool {
  return value is NSNull || value == nil
}

private func nilOrValue<T>(_ value: Any?) -> T? {
  if value is NSNull { return nil }
  return value as! T?
}

/// Data structure for authenticating
///
/// Generated class from Pigeon that represents data sent in messages.
struct AuthenticateRequest {
  var key: String
  var androidPrompt: AndroidPrompt
  var iOsPrompt: IOsPrompt

  static func fromList(_ list: [Any?]) -> AuthenticateRequest? {
    let key = list[0] as! String
    let androidPrompt = AndroidPrompt.fromList(list[1] as! [Any?])!
    let iOsPrompt = IOsPrompt.fromList(list[2] as! [Any?])!

    return AuthenticateRequest(
      key: key,
      androidPrompt: androidPrompt,
      iOsPrompt: iOsPrompt
    )
  }
  func toList() -> [Any?] {
    return [
      key,
      androidPrompt.toList(),
      iOsPrompt.toList(),
    ]
  }
}

/// Data structure for retrieving the saved secret
///
/// Generated class from Pigeon that represents data sent in messages.
struct RetrieveSecretRequest {
  var key: String
  var androidPrompt: AndroidPrompt
  var iOsPrompt: IOsPrompt

  static func fromList(_ list: [Any?]) -> RetrieveSecretRequest? {
    let key = list[0] as! String
    let androidPrompt = AndroidPrompt.fromList(list[1] as! [Any?])!
    let iOsPrompt = IOsPrompt.fromList(list[2] as! [Any?])!

    return RetrieveSecretRequest(
      key: key,
      androidPrompt: androidPrompt,
      iOsPrompt: iOsPrompt
    )
  }
  func toList() -> [Any?] {
    return [
      key,
      androidPrompt.toList(),
      iOsPrompt.toList(),
    ]
  }
}

/// Data structure for saving the saved secret
///
/// Generated class from Pigeon that represents data sent in messages.
struct SaveSecretRequest {
  var key: String
  var secret: String
  var androidPrompt: AndroidPrompt

  static func fromList(_ list: [Any?]) -> SaveSecretRequest? {
    let key = list[0] as! String
    let secret = list[1] as! String
    let androidPrompt = AndroidPrompt.fromList(list[2] as! [Any?])!

    return SaveSecretRequest(
      key: key,
      secret: secret,
      androidPrompt: androidPrompt
    )
  }
  func toList() -> [Any?] {
    return [
      key,
      secret,
      androidPrompt.toList(),
    ]
  }
}

/// Defines text that's displayed in native OS prompt for authentication
///
/// title and cancel are required.
///
/// Generated class from Pigeon that represents data sent in messages.
struct AndroidPrompt {
  var title: String
  var cancelLabel: String
  var descriptionLabel: String? = nil

  static func fromList(_ list: [Any?]) -> AndroidPrompt? {
    let title = list[0] as! String
    let cancelLabel = list[1] as! String
    let descriptionLabel: String? = nilOrValue(list[2])

    return AndroidPrompt(
      title: title,
      cancelLabel: cancelLabel,
      descriptionLabel: descriptionLabel
    )
  }
  func toList() -> [Any?] {
    return [
      title,
      cancelLabel,
      descriptionLabel,
    ]
  }
}

/// The iOS native dialog is only shown when retrieving secret.
///
/// - For phones with Touch ID, the [touchIdText] is displayed in prompt.
/// - For phones with Face ID, the text is defined in plist file.
///
/// Generated class from Pigeon that represents data sent in messages.
struct IOsPrompt {
  var touchIdText: String

  static func fromList(_ list: [Any?]) -> IOsPrompt? {
    let touchIdText = list[0] as! String

    return IOsPrompt(
      touchIdText: touchIdText
    )
  }
  func toList() -> [Any?] {
    return [
      touchIdText
    ]
  }
}

private class PigeonApiCodecReader: FlutterStandardReader {
  override func readValue(ofType type: UInt8) -> Any? {
    switch type {
    case 128:
      return AndroidPrompt.fromList(self.readValue() as! [Any?])
    case 129:
      return AuthenticateRequest.fromList(self.readValue() as! [Any?])
    case 130:
      return IOsPrompt.fromList(self.readValue() as! [Any?])
    case 131:
      return RetrieveSecretRequest.fromList(self.readValue() as! [Any?])
    case 132:
      return SaveSecretRequest.fromList(self.readValue() as! [Any?])
    default:
      return super.readValue(ofType: type)
    }
  }
}

private class PigeonApiCodecWriter: FlutterStandardWriter {
  override func writeValue(_ value: Any) {
    if let value = value as? AndroidPrompt {
      super.writeByte(128)
      super.writeValue(value.toList())
    } else if let value = value as? AuthenticateRequest {
      super.writeByte(129)
      super.writeValue(value.toList())
    } else if let value = value as? IOsPrompt {
      super.writeByte(130)
      super.writeValue(value.toList())
    } else if let value = value as? RetrieveSecretRequest {
      super.writeByte(131)
      super.writeValue(value.toList())
    } else if let value = value as? SaveSecretRequest {
      super.writeByte(132)
      super.writeValue(value.toList())
    } else {
      super.writeValue(value)
    }
  }
}

private class PigeonApiCodecReaderWriter: FlutterStandardReaderWriter {
  override func reader(with data: Data) -> FlutterStandardReader {
    return PigeonApiCodecReader(data: data)
  }

  override func writer(with data: NSMutableData) -> FlutterStandardWriter {
    return PigeonApiCodecWriter(data: data)
  }
}

class PigeonApiCodec: FlutterStandardMessageCodec {
  static let shared = PigeonApiCodec(readerWriter: PigeonApiCodecReaderWriter())
}

/// Generated protocol from Pigeon that represents a handler of messages from Flutter.
protocol PigeonApi {
  func canAuthenticate(completion: @escaping (Result<Bool, Error>) -> Void)
  func authenticate(request: AuthenticateRequest, completion: @escaping (Result<Bool, Error>) -> Void)
  func save(request: SaveSecretRequest, completion: @escaping (Result<Void, Error>) -> Void)
  func retrieve(request: RetrieveSecretRequest, completion: @escaping (Result<String, Error>) -> Void)
  func delete(key: String, completion: @escaping (Result<Void, Error>) -> Void)
}

/// Generated setup class from Pigeon to handle messages through the `binaryMessenger`.
class PigeonApiSetup {
  /// The codec used by PigeonApi.
  static var codec: FlutterStandardMessageCodec { PigeonApiCodec.shared }
  /// Sets up an instance of `PigeonApi` to handle messages through the `binaryMessenger`.
  static func setUp(binaryMessenger: FlutterBinaryMessenger, api: PigeonApi?) {
    let canAuthenticateChannel = FlutterBasicMessageChannel(name: "dev.flutter.pigeon.flutter_locker.PigeonApi.canAuthenticate", binaryMessenger: binaryMessenger, codec: codec)
    if let api = api {
      canAuthenticateChannel.setMessageHandler { _, reply in
        api.canAuthenticate { result in
          switch result {
          case .success(let res):
            reply(wrapResult(res))
          case .failure(let error):
            reply(wrapError(error))
          }
        }
      }
    } else {
      canAuthenticateChannel.setMessageHandler(nil)
    }
    let authenticateChannel = FlutterBasicMessageChannel(name: "dev.flutter.pigeon.flutter_locker.PigeonApi.authenticate", binaryMessenger: binaryMessenger, codec: codec)
    if let api = api {
      authenticateChannel.setMessageHandler { message, reply in
        let args = message as! [Any?]
        let requestArg = args[0] as! AuthenticateRequest
        api.authenticate(request: requestArg) { result in
          switch result {
          case .success(let res):
            reply(wrapResult(res))
          case .failure(let error):
            reply(wrapError(error))
          }
        }
      }
    } else {
      authenticateChannel.setMessageHandler(nil)
    }
    let saveChannel = FlutterBasicMessageChannel(name: "dev.flutter.pigeon.flutter_locker.PigeonApi.save", binaryMessenger: binaryMessenger, codec: codec)
    if let api = api {
      saveChannel.setMessageHandler { message, reply in
        let args = message as! [Any?]
        let requestArg = args[0] as! SaveSecretRequest
        api.save(request: requestArg) { result in
          switch result {
          case .success:
            reply(wrapResult(nil))
          case .failure(let error):
            reply(wrapError(error))
          }
        }
      }
    } else {
      saveChannel.setMessageHandler(nil)
    }
    let retrieveChannel = FlutterBasicMessageChannel(name: "dev.flutter.pigeon.flutter_locker.PigeonApi.retrieve", binaryMessenger: binaryMessenger, codec: codec)
    if let api = api {
      retrieveChannel.setMessageHandler { message, reply in
        let args = message as! [Any?]
        let requestArg = args[0] as! RetrieveSecretRequest
        api.retrieve(request: requestArg) { result in
          switch result {
          case .success(let res):
            reply(wrapResult(res))
          case .failure(let error):
            reply(wrapError(error))
          }
        }
      }
    } else {
      retrieveChannel.setMessageHandler(nil)
    }
    let deleteChannel = FlutterBasicMessageChannel(name: "dev.flutter.pigeon.flutter_locker.PigeonApi.delete", binaryMessenger: binaryMessenger, codec: codec)
    if let api = api {
      deleteChannel.setMessageHandler { message, reply in
        let args = message as! [Any?]
        let keyArg = args[0] as! String
        api.delete(key: keyArg) { result in
          switch result {
          case .success:
            reply(wrapResult(nil))
          case .failure(let error):
            reply(wrapError(error))
          }
        }
      }
    } else {
      deleteChannel.setMessageHandler(nil)
    }
  }
}
