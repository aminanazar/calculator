import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class CalcButton extends StatelessWidget {
  final String text;
  final int fillColor;
  final int textColor;
  final double textSize;
  final Function callBack;

  const CalcButton({
    Key key,
    this.fillColor,
    this.text,
    this.textColor= 0xFFFFFFFF,
     this.textSize=24,
     this.callBack,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      margin:EdgeInsets.all(10),
      child: SizedBox(
        width: 70,
        height:70,
        child: FlatButton(
          shape:RoundedRectangleBorder(
            borderRadius:BorderRadius.circular(50),
          ),
            child:Text(text,style:GoogleFonts.rubik(
              textStyle:TextStyle(
                fontSize:textSize,
              ),
            ),),
        onPressed: () {
             callBack(text);
              print("calculate button pressed");
        } ,

          color: fillColor != null ? Color(fillColor) : null,
          textColor: Color(textColor),
        ),
      ),
    );
  }
}
