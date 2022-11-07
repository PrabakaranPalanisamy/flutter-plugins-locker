// Autogenerated from Pigeon (v4.2.5), do not edit directly.
// See also: https://pub.dev/packages/pigeon
#import <Foundation/Foundation.h>
@protocol FlutterBinaryMessenger;
@protocol FlutterMessageCodec;
@class FlutterError;
@class FlutterStandardTypedData;

NS_ASSUME_NONNULL_BEGIN

@class RetrieveSecretRequest;
@class SaveSecretRequest;
@class AndroidPrompt;
@class IOsPrompt;

/// Command to generate all files:
/// flutter pub run pigeon --input lib/pigeons/locker_api.dart --dart_out lib/gen/locker_api.gen.dart --objc_header_out ios/Classes/flutter_locker.h --objc_source_out ios/Classes/flutter_locker.m --java_out ./android/src/main/java/com/example/flutter_locker/FlutterLocker.java --java_package “com.example.flutter_locker”
/// Data structure for retrieving the saved secret
@interface RetrieveSecretRequest : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithKey:(NSString *)key
    androidPrompt:(AndroidPrompt *)androidPrompt
    iOsPrompt:(IOsPrompt *)iOsPrompt;
@property(nonatomic, copy) NSString * key;
@property(nonatomic, strong) AndroidPrompt * androidPrompt;
@property(nonatomic, strong) IOsPrompt * iOsPrompt;
@end

/// Data structure for saving the saved secret
@interface SaveSecretRequest : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithKey:(NSString *)key
    secret:(NSString *)secret
    androidPrompt:(AndroidPrompt *)androidPrompt;
@property(nonatomic, copy) NSString * key;
@property(nonatomic, copy) NSString * secret;
@property(nonatomic, strong) AndroidPrompt * androidPrompt;
@end

/// Defines text that's displayed in native OS prompt for authentication
///
/// title and cancel are required.
@interface AndroidPrompt : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithTitle:(NSString *)title
    cancelLabel:(NSString *)cancelLabel
    descriptionLabel:(nullable NSString *)descriptionLabel;
@property(nonatomic, copy) NSString * title;
@property(nonatomic, copy) NSString * cancelLabel;
@property(nonatomic, copy, nullable) NSString * descriptionLabel;
@end

/// The iOS native dialog is only shown when retrieving secret.
///
/// - For phones with Touch ID, the [touchIdText] is displayed in prompt.
/// - For phones with Face ID, the text is defined in plist file.
@interface IOsPrompt : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithTouchIdText:(NSString *)touchIdText;
@property(nonatomic, copy) NSString * touchIdText;
@end

/// The codec used by PigeonApi.
NSObject<FlutterMessageCodec> *PigeonApiGetCodec(void);

@protocol PigeonApi
- (void)canAuthenticateWithCompletion:(void(^)(NSNumber *_Nullable, FlutterError *_Nullable))completion;
- (void)saveRequest:(SaveSecretRequest *)request completion:(void(^)(NSNumber *_Nullable, FlutterError *_Nullable))completion;
- (void)retrieveRequest:(RetrieveSecretRequest *)request completion:(void(^)(NSString *_Nullable, FlutterError *_Nullable))completion;
- (void)deleteKey:(NSString *)key completion:(void(^)(FlutterError *_Nullable))completion;
@end

extern void PigeonApiSetup(id<FlutterBinaryMessenger> binaryMessenger, NSObject<PigeonApi> *_Nullable api);

NS_ASSUME_NONNULL_END
