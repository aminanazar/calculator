import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:math_expressions/math_expressions.dart';

import 'Widgets/CalcButton.dart';

void main() {
  runApp(CalcApp());
}
class CalcApp extends StatefulWidget {
  const CalcApp({Key key}) : super(key: key);

  @override
  CalcAppState createState() => CalcAppState();
}
class CalcAppState extends State<CalcApp> {
  String _history=" ";
  String _expression=" ";

  void numClick(String text){
    setState((){
      _expression +=text;
    });
  }
  void allClear(String text){
    setState(()
    {
      _history='';
      _expression ='';
    })  ;
  }
  void clear(String text){
    setState(() {
      _expression= '';
    });
  }
  void evaluate(String text){
    Parser p=Parser();
    Expression exp = p.parse(_expression);
    ContextModel cm = ContextModel();
    double eval = exp.evaluate(EvaluationType.REAL,cm);
    setState((){
        _history=_expression;
        _expression=eval.toString() ;
    });
  }


  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Calculator',
      home: Scaffold(
       backgroundColor: Colors.black,
        body:Column(
          mainAxisAlignment: MainAxisAlignment.end,
          children:<Widget>[
            Container(
              padding:EdgeInsets.only(right: 12),
              child:Text(_history,
                style:GoogleFonts.rubik(
                  textStyle:TextStyle( fontSize:24,
                    color: Color(0xFF545F61),
                  ),
                ),
              ),
              alignment:Alignment.centerRight,
            ),
            Container(
              padding:EdgeInsets.all(12),
              child:Text(_expression,
                  style:GoogleFonts.rubik(
                    textStyle:TextStyle( fontSize:48,
                    color: Colors.white,
                    ),
              ),
            ),
              alignment:Alignment.centerRight,
            ),
            SizedBox(height:40),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: <Widget>[
                CalcButton(
                  text:'AC',
                  fillColor:0xFF6C807F,
                  textSize: 20,
                  callBack: allClear,
                ),
                CalcButton(
                  text:'C',
                  fillColor: 0xFF6C807F,
                  callBack: clear,
                ),
                CalcButton(
                  text:'%',
                  fillColor: 0xFFFFFFFF,
                  textColor: 0xFF65BDAC,
                  callBack: numClick,
                ),
                CalcButton(
                  text:'/',
                  fillColor: 0xFFFFFFFF,
                  textColor: 0xFF65BDAC,
                  callBack: numClick,
                ),
              ],
            ),
            Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
               children: <Widget>[
               CalcButton(
                text:'7',
                  callBack: numClick, 

               ),
               CalcButton(
              text:'8',
                  callBack: numClick,
              ),
               CalcButton(
               text:'9',
                  callBack: numClick,
               ),
               CalcButton(
              text:'*',
             fillColor: 0xFFFFFFFF,
                 textColor: 0xFF65BDAC,
                 callBack: numClick,
            ),
                  ],
        ),
                  Row(
                   mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                   children: <Widget>[
                     CalcButton(
                       text:'4',
                        callBack: numClick,
                     ),
                     CalcButton(
                       text:'5',
                        callBack: numClick,
                     ),
                     CalcButton(
                       text:'6',
                        callBack: numClick,
                     ),
                     CalcButton(
                       text:'-',
                       fillColor: 0xFFFFFFFF,
                       textColor: 0xFF65BDAC,
                       callBack: numClick,
                     ),
                     ],
                  ),

                     Row(
                       mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                       children: <Widget>[
                         CalcButton(
                           text:'1',
                           callBack: numClick,
                         ),
                         CalcButton(
                           text:'2',
                            callBack: numClick,
                         ),
                         CalcButton(
                           text:'3',
                            callBack: numClick,
                         ),
                         CalcButton(
                           text:'+',
                           fillColor: 0xFFFFFFFF,
                           textColor: 0xFF65BDAC,
                           callBack: numClick,
                         ),
                         ],
                     ),
                         Row(
                         mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                           children: <Widget>[
                               CalcButton(
                                     text:'.',
                                  callBack: numClick,
                           ),
                                    CalcButton(
                                    text:'0',
                                       callBack: numClick,
                           ),
                             CalcButton(
                                   text:'00',
                                callBack: numClick,
                          ),
                                 CalcButton(
                                           text:'=',
                                       fillColor: 0xFFFFFFFF,
                                   textColor: 0xFF65BDAC,
                                   callBack: evaluate,
                           ),
                        ],
                         ),
           ],
          ),
      ),
    );
  }
}
