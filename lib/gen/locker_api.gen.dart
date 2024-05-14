// Autogenerated from Pigeon (v17.3.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon
// ignore_for_file: public_member_api_docs, non_constant_identifier_names, avoid_as, unused_import, unnecessary_parenthesis, prefer_null_aware_operators, omit_local_variable_types, unused_shown_name, unnecessary_import, no_leading_underscores_for_local_identifiers

import 'dart:async';
import 'dart:typed_data' show Float64List, Int32List, Int64List, Uint8List;

import 'package:flutter/foundation.dart' show ReadBuffer, WriteBuffer;
import 'package:flutter/services.dart';

PlatformException _createConnectionError(String channelName) {
  return PlatformException(
    code: 'channel-error',
    message: 'Unable to establish connection on channel: "$channelName".',
  );
}

/// Data structure for authenticating
class AuthenticateRequest {
  AuthenticateRequest({
    required this.key,
    required this.androidPrompt,
    required this.iOsPrompt,
  });

  String key;

  AndroidPrompt androidPrompt;

  IOsPrompt iOsPrompt;

  Object encode() {
    return <Object?>[
      key,
      androidPrompt.encode(),
      iOsPrompt.encode(),
    ];
  }

  static AuthenticateRequest decode(Object result) {
    result as List<Object?>;
    return AuthenticateRequest(
      key: result[0]! as String,
      androidPrompt: AndroidPrompt.decode(result[1]! as List<Object?>),
      iOsPrompt: IOsPrompt.decode(result[2]! as List<Object?>),
    );
  }
}

/// Data structure for retrieving the saved secret
class RetrieveSecretRequest {
  RetrieveSecretRequest({
    required this.key,
    required this.androidPrompt,
    required this.iOsPrompt,
  });

  String key;

  AndroidPrompt androidPrompt;

  IOsPrompt iOsPrompt;

  Object encode() {
    return <Object?>[
      key,
      androidPrompt.encode(),
      iOsPrompt.encode(),
    ];
  }

  static RetrieveSecretRequest decode(Object result) {
    result as List<Object?>;
    return RetrieveSecretRequest(
      key: result[0]! as String,
      androidPrompt: AndroidPrompt.decode(result[1]! as List<Object?>),
      iOsPrompt: IOsPrompt.decode(result[2]! as List<Object?>),
    );
  }
}

/// Data structure for saving the saved secret
class SaveSecretRequest {
  SaveSecretRequest({
    required this.key,
    required this.secret,
    required this.androidPrompt,
  });

  String key;

  String secret;

  AndroidPrompt androidPrompt;

  Object encode() {
    return <Object?>[
      key,
      secret,
      androidPrompt.encode(),
    ];
  }

  static SaveSecretRequest decode(Object result) {
    result as List<Object?>;
    return SaveSecretRequest(
      key: result[0]! as String,
      secret: result[1]! as String,
      androidPrompt: AndroidPrompt.decode(result[2]! as List<Object?>),
    );
  }
}

/// Defines text that's displayed in native OS prompt for authentication
///
/// title and cancel are required.
class AndroidPrompt {
  AndroidPrompt({
    required this.title,
    required this.cancelLabel,
    this.descriptionLabel,
  });

  String title;

  String cancelLabel;

  String? descriptionLabel;

  Object encode() {
    return <Object?>[
      title,
      cancelLabel,
      descriptionLabel,
    ];
  }

  static AndroidPrompt decode(Object result) {
    result as List<Object?>;
    return AndroidPrompt(
      title: result[0]! as String,
      cancelLabel: result[1]! as String,
      descriptionLabel: result[2] as String?,
    );
  }
}

/// The iOS native dialog is only shown when retrieving secret.
///
/// - For phones with Touch ID, the [touchIdText] is displayed in prompt.
/// - For phones with Face ID, the text is defined in plist file.
class IOsPrompt {
  IOsPrompt({
    required this.touchIdText,
  });

  String touchIdText;

  Object encode() {
    return <Object?>[
      touchIdText,
    ];
  }

  static IOsPrompt decode(Object result) {
    result as List<Object?>;
    return IOsPrompt(
      touchIdText: result[0]! as String,
    );
  }
}

class _PigeonApiCodec extends StandardMessageCodec {
  const _PigeonApiCodec();
  @override
  void writeValue(WriteBuffer buffer, Object? value) {
    if (value is AndroidPrompt) {
      buffer.putUint8(128);
      writeValue(buffer, value.encode());
    } else if (value is AuthenticateRequest) {
      buffer.putUint8(129);
      writeValue(buffer, value.encode());
    } else if (value is IOsPrompt) {
      buffer.putUint8(130);
      writeValue(buffer, value.encode());
    } else if (value is RetrieveSecretRequest) {
      buffer.putUint8(131);
      writeValue(buffer, value.encode());
    } else if (value is SaveSecretRequest) {
      buffer.putUint8(132);
      writeValue(buffer, value.encode());
    } else {
      super.writeValue(buffer, value);
    }
  }

  @override
  Object? readValueOfType(int type, ReadBuffer buffer) {
    switch (type) {
      case 128: 
        return AndroidPrompt.decode(readValue(buffer)!);
      case 129: 
        return AuthenticateRequest.decode(readValue(buffer)!);
      case 130: 
        return IOsPrompt.decode(readValue(buffer)!);
      case 131: 
        return RetrieveSecretRequest.decode(readValue(buffer)!);
      case 132: 
        return SaveSecretRequest.decode(readValue(buffer)!);
      default:
        return super.readValueOfType(type, buffer);
    }
  }
}

class PigeonApi {
  /// Constructor for [PigeonApi].  The [binaryMessenger] named argument is
  /// available for dependency injection.  If it is left null, the default
  /// BinaryMessenger will be used which routes to the host platform.
  PigeonApi({BinaryMessenger? binaryMessenger})
      : __pigeon_binaryMessenger = binaryMessenger;
  final BinaryMessenger? __pigeon_binaryMessenger;

  static const MessageCodec<Object?> pigeonChannelCodec = _PigeonApiCodec();

  Future<bool> canAuthenticate() async {
    const String __pigeon_channelName = 'dev.flutter.pigeon.flutter_locker.PigeonApi.canAuthenticate';
    final BasicMessageChannel<Object?> __pigeon_channel = BasicMessageChannel<Object?>(
      __pigeon_channelName,
      pigeonChannelCodec,
      binaryMessenger: __pigeon_binaryMessenger,
    );
    final List<Object?>? __pigeon_replyList =
        await __pigeon_channel.send(null) as List<Object?>?;
    if (__pigeon_replyList == null) {
      throw _createConnectionError(__pigeon_channelName);
    } else if (__pigeon_replyList.length > 1) {
      throw PlatformException(
        code: __pigeon_replyList[0]! as String,
        message: __pigeon_replyList[1] as String?,
        details: __pigeon_replyList[2],
      );
    } else if (__pigeon_replyList[0] == null) {
      throw PlatformException(
        code: 'null-error',
        message: 'Host platform returned null value for non-null return value.',
      );
    } else {
      return (__pigeon_replyList[0] as bool?)!;
    }
  }

  Future<bool> authenticate(AuthenticateRequest request) async {
    const String __pigeon_channelName = 'dev.flutter.pigeon.flutter_locker.PigeonApi.authenticate';
    final BasicMessageChannel<Object?> __pigeon_channel = BasicMessageChannel<Object?>(
      __pigeon_channelName,
      pigeonChannelCodec,
      binaryMessenger: __pigeon_binaryMessenger,
    );
    final List<Object?>? __pigeon_replyList =
        await __pigeon_channel.send(<Object?>[request]) as List<Object?>?;
    if (__pigeon_replyList == null) {
      throw _createConnectionError(__pigeon_channelName);
    } else if (__pigeon_replyList.length > 1) {
      throw PlatformException(
        code: __pigeon_replyList[0]! as String,
        message: __pigeon_replyList[1] as String?,
        details: __pigeon_replyList[2],
      );
    } else if (__pigeon_replyList[0] == null) {
      throw PlatformException(
        code: 'null-error',
        message: 'Host platform returned null value for non-null return value.',
      );
    } else {
      return (__pigeon_replyList[0] as bool?)!;
    }
  }

  Future<void> save(SaveSecretRequest request) async {
    const String __pigeon_channelName = 'dev.flutter.pigeon.flutter_locker.PigeonApi.save';
    final BasicMessageChannel<Object?> __pigeon_channel = BasicMessageChannel<Object?>(
      __pigeon_channelName,
      pigeonChannelCodec,
      binaryMessenger: __pigeon_binaryMessenger,
    );
    final List<Object?>? __pigeon_replyList =
        await __pigeon_channel.send(<Object?>[request]) as List<Object?>?;
    if (__pigeon_replyList == null) {
      throw _createConnectionError(__pigeon_channelName);
    } else if (__pigeon_replyList.length > 1) {
      throw PlatformException(
        code: __pigeon_replyList[0]! as String,
        message: __pigeon_replyList[1] as String?,
        details: __pigeon_replyList[2],
      );
    } else {
      return;
    }
  }

  Future<String> retrieve(RetrieveSecretRequest request) async {
    const String __pigeon_channelName = 'dev.flutter.pigeon.flutter_locker.PigeonApi.retrieve';
    final BasicMessageChannel<Object?> __pigeon_channel = BasicMessageChannel<Object?>(
      __pigeon_channelName,
      pigeonChannelCodec,
      binaryMessenger: __pigeon_binaryMessenger,
    );
    final List<Object?>? __pigeon_replyList =
        await __pigeon_channel.send(<Object?>[request]) as List<Object?>?;
    if (__pigeon_replyList == null) {
      throw _createConnectionError(__pigeon_channelName);
    } else if (__pigeon_replyList.length > 1) {
      throw PlatformException(
        code: __pigeon_replyList[0]! as String,
        message: __pigeon_replyList[1] as String?,
        details: __pigeon_replyList[2],
      );
    } else if (__pigeon_replyList[0] == null) {
      throw PlatformException(
        code: 'null-error',
        message: 'Host platform returned null value for non-null return value.',
      );
    } else {
      return (__pigeon_replyList[0] as String?)!;
    }
  }

  Future<void> delete(String key) async {
    const String __pigeon_channelName = 'dev.flutter.pigeon.flutter_locker.PigeonApi.delete';
    final BasicMessageChannel<Object?> __pigeon_channel = BasicMessageChannel<Object?>(
      __pigeon_channelName,
      pigeonChannelCodec,
      binaryMessenger: __pigeon_binaryMessenger,
    );
    final List<Object?>? __pigeon_replyList =
        await __pigeon_channel.send(<Object?>[key]) as List<Object?>?;
    if (__pigeon_replyList == null) {
      throw _createConnectionError(__pigeon_channelName);
    } else if (__pigeon_replyList.length > 1) {
      throw PlatformException(
        code: __pigeon_replyList[0]! as String,
        message: __pigeon_replyList[1] as String?,
        details: __pigeon_replyList[2],
      );
    } else {
      return;
    }
  }
}
