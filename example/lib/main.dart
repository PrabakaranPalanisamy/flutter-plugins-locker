import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'dart:async';

import 'package:flutter/services.dart';
import 'package:flutter_locker/flutter_locker.dart';

void main() {
  runApp(MaterialApp(home: Scaffold(body: MyApp())));
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String key = 'pwdk';

  @override
  void initState() {
    super.initState();
    initPlatformState();
  }

  Future<void> initPlatformState() async {
    // do stuff

    // If the widget was removed from the tree while the asynchronous platform
    // message was in flight, we want to discard the reply rather than calling
    // setState to update our non-existent appearance.
    if (!mounted) return;

    setState(() {
      // set state
    });
  }

  Future<void> _canAuthenticate(BuildContext context) async {
    FlutterLocker.canAuthenticate().then((value) {
      Scaffold.of(context).showSnackBar(SnackBar(content: Text('Can authenticate: ' + value.toString())));
    }).catchError((err) {
      Scaffold.of(context).showSnackBar(SnackBar(content: Text('Error happened: ' + err.toString())));
    });
  }

  Future<void> _saveSecret(BuildContext context) async {
    FlutterLocker.save(key, "1111", "Authenticate", "Cancel").then((value) {
        Scaffold.of(context).showSnackBar(SnackBar(content: Text('Successfully Saved!')));
    }).catchError((err) {
      Scaffold.of(context).showSnackBar(SnackBar(content: Text('Error happened: ' + err.toString())));
    });
  }

  Future<void> _retrieveSecret(BuildContext context) async {
    FlutterLocker.retrieve(key, "Authenticate to Login", "Cancel").then((value) {
        Scaffold.of(context).showSnackBar(SnackBar(content: Text('Retrieved secret: ' + value)));
    }).catchError((err) {
      Scaffold.of(context).showSnackBar(SnackBar(content: Text('Error happened: ' + err.toString())));
    });
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Column(
            children: <Widget>[
              SizedBox(height: 20),
              Center(
                child: Text('Goldilocks finger example'),
              ),
              SizedBox(height: 20),
              CupertinoButton.filled(child: Text("Can authenticate"), onPressed: () {
                _canAuthenticate(context);
              }),
              SizedBox(height: 20),
              CupertinoButton.filled(child: Text("Save"), onPressed: () {
                _saveSecret(context);
              }),
              SizedBox(height: 20),
              CupertinoButton.filled(child: Text("Retrieve"), onPressed: () {
                _retrieveSecret(context);
              })
            ],
          ),
    );
  }
}