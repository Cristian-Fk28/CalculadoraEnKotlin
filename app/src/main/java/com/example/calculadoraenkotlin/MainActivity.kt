package com.example.calculadoraenkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.math.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var operador:String? =null
    private var valorAnterior:String?=null
    private var txtResultado:EditText?=null

    private var btn1:Button?=null
    private var btn2:Button?=null
    private var btn3:Button?=null
    private var btn4:Button?=null
    private var btn5:Button?=null
    private var btn6:Button?=null
    private var btn7:Button?=null
    private var btn8:Button?=null
    private var btn9:Button?=null
    private var btn0:Button?=null
    private var btnPunto:Button?=null
    private var btnIgual:Button?=null
    private var btnBorrar:Button?=null
    private var btnBorrarT:Button?=null



    private var btnSuma:Button?=null
    private var btnResta:Button?=null
    private var btnDivision:Button?=null
    private var btnMultiplicacion:Button?=null
    private var btnCoseno:Button?=null
    private var btnSeno:Button?=null
    private var btnTangente:Button?=null
    private var btnRaiz:Button?=null
    private var btnPorcentaje:Button?=null
    private var btnctg:Button?=null
    private var btnFac:Button?=null
    private var btnLog:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResultado=findViewById<EditText>(R.id.txtRespuesta)
        btn1=findViewById<Button>(R.id.button1)
        btn2=findViewById<Button>(R.id.button2)
        btn3=findViewById<Button>(R.id.button3)
        btn4=findViewById<Button>(R.id.button4)
        btn5=findViewById<Button>(R.id.button5)
        btn6=findViewById<Button>(R.id.button6)
        btn7=findViewById<Button>(R.id.button7)
        btn8=findViewById<Button>(R.id.button8)
        btn9=findViewById<Button>(R.id.button9)
        btnIgual=findViewById<Button>(R.id.buttonIgual)

        btn0=findViewById<Button>(R.id.btn0)
        btnBorrar=findViewById<Button>(R.id.buttonBorrar)
        btnBorrarT=findViewById<Button>(R.id.buttonBorrarT)
        btnPunto=findViewById<Button>(R.id.buttonPunto)
        btnSuma=findViewById<Button>(R.id.buttonSuma)
        btnResta=findViewById<Button>(R.id.buttonResta)
        btnMultiplicacion=findViewById<Button>(R.id.buttonMultiplicacion)
        btnDivision=findViewById<Button>(R.id.buttonDivision)
        btnSeno=findViewById<Button>(R.id.buttonSen)
        btnCoseno=findViewById<Button>(R.id.buttonCos)
        btnTangente=findViewById<Button>(R.id.buttonTangente)
        btnRaiz=findViewById<Button>(R.id.buttonRaiz)
        btnPorcentaje=findViewById<Button>(R.id.buttonPorcentaje)
        btnLog=findViewById<Button>(R.id.buttonLog)
        btnFac=findViewById<Button>(R.id.buttonFac)
        btnctg=findViewById<Button>(R.id.buttonCtg)

        btn1!!.setOnClickListener(this)
        btn2!!.setOnClickListener(this)
        btn3!!.setOnClickListener(this)
        btn4!!.setOnClickListener(this)
        btn5!!.setOnClickListener(this)
        btn6!!.setOnClickListener(this)
        btn7!!.setOnClickListener(this)
        btn8!!.setOnClickListener(this)
        btn9!!.setOnClickListener(this)
        btn0!!.setOnClickListener(this)

        btnBorrar!!.setOnClickListener(this)
        btnBorrarT!!.setOnClickListener(this)


        btnPunto!!.setOnClickListener(this)
        btnSuma!!.setOnClickListener(this)
        btnResta!!.setOnClickListener(this)
        btnMultiplicacion!!.setOnClickListener(this)
        btnDivision!!.setOnClickListener(this)
        btnSeno!!.setOnClickListener(this)
        btnCoseno!!.setOnClickListener(this)
        btnTangente!!.setOnClickListener(this)
        btnIgual!!.setOnClickListener(this)
        btnRaiz!!.setOnClickListener(this)
        btnPorcentaje!!.setOnClickListener(this)
        btnLog!!.setOnClickListener(this)
        btnFac!!.setOnClickListener(this)
        btnctg!!.setOnClickListener(this)

        val Kotlin = findViewById<Button>(R.id.btnKotlin)
        Kotlin.setOnClickListener {
            val Kotlin = Intent(this, MainActivity2::class.java)
            startActivity(Kotlin)

        }

    }

    override fun onClick(v: View?) {
       var resultado:Float=0f

        when(v?.id){
            R.id.button1->(txtResultado?.setText(txtResultado?.text.toString()+"1"))
            R.id.button2->(txtResultado?.setText(txtResultado?.text.toString()+"2"))
            R.id.button3->(txtResultado?.setText(txtResultado?.text.toString()+"3"))
            R.id.button4->(txtResultado?.setText(txtResultado?.text.toString()+"4"))
            R.id.button5->(txtResultado?.setText(txtResultado?.text.toString()+"5"))
            R.id.button6->(txtResultado?.setText(txtResultado?.text.toString()+"6"))
            R.id.button7->(txtResultado?.setText(txtResultado?.text.toString()+"7"))
            R.id.button8->(txtResultado?.setText(txtResultado?.text.toString()+"8"))
            R.id.button9->(txtResultado?.setText(txtResultado?.text.toString()+"9"))
            R.id.btn0->(txtResultado?.setText(txtResultado?.text.toString()+"0"))
            R.id.buttonPunto->(txtResultado?.setText(txtResultado?.text.toString()+"."))

            R.id.buttonSuma -> {
                //Almacenamos el valor anterior
                valorAnterior=txtResultado?.text.toString()
                txtResultado?.setText("") // Lo ingresado lo ponemos en vacio
                operador="+"
            }
            R.id.buttonResta -> {
                //Almacenamos el valor anterior
                valorAnterior=txtResultado?.text.toString()
                txtResultado?.setText("")// Lo ingresado lo ponemos en vacio
                operador="-"
            }
            R.id.buttonMultiplicacion -> {
                //Almacenamos el valor anterior
                valorAnterior=txtResultado?.text.toString()
                txtResultado?.setText("")// Lo ingresado lo ponemos en vacio
                operador="*"
            }
            R.id.buttonDivision -> {
                //Almacenamos el valor anterior
                valorAnterior=txtResultado?.text.toString()
                txtResultado?.setText("")// Lo ingresado lo ponemos en vacio
                operador="/"
            }
            R.id.buttonFac -> {
                //Almacenamos el valor anterior
                operador = "f"
                var fact: Long=1
                var i = 1
                when (operador) {
                    "f" -> {
                        while (i <= txtResultado?.text.toString().toFloat()) {
                            fact *= i.toLong()
                            i++
                        }
                        txtResultado?.setText(fact.toString());
                    }
                }
            }
            R.id.buttonLog -> {
                //Almacenamos el valor anterior
                operador = "l"
                when (operador) {
                    "l" -> {
                        resultado = log10(txtResultado?.text.toString().toFloat())
                        txtResultado?.setText(resultado.toString());
                    }
                }
            }
            R.id.buttonTangente->{
                operador="o"
                var r:Double=0.0
                when(operador){
                    "o"->{
                        r=(Math.tan(txtResultado?.text.toString().toFloat()*2.0*Math.PI/360.0) );
                        txtResultado?.setText(r.toString());
                    }
                }
            }

            R.id.buttonCtg->{
               resultado= txtResultado?.text.toString().toFloat()
                resultado=resultado*(-1)
                txtResultado?.setText(resultado.toString())
                if(resultado>0){
                    btnctg?.setText("+")

                }
                else
                {
                    btnctg?.setText("-")
                }
            }
            R.id.buttonSen -> {
                //Almacenamos el valor anterior
                operador = "s"

                var resulSeno:Double = 0.0
                when (operador) {
                    "s" -> {
                        resulSeno = (Math.sin(txtResultado?.text.toString().toFloat()*2.0*Math.PI/360.0));
                        txtResultado?.setText(resulSeno.toString());
                    }
                }
            }
            R.id.buttonCos -> {
                //Almacenamos el valor anterior
                operador = "c"

                var resulC:Double = 0.0
                when (operador) {
                    "c" -> {
                        resulC = (Math.cos(txtResultado?.text.toString().toFloat()*Math.PI/180));
                        txtResultado?.setText(resulC.toString());
                    }
                }
            }

            R.id.buttonRaiz -> {
                //Almacenamos el valor anterior
                operador = "r"
                when (operador) {
                    "r" -> {
                        resultado = sqrt(txtResultado?.text.toString().toFloat())
                        txtResultado?.setText(resultado.toString());
                    }
                }
            }
            R.id.buttonPorcentaje -> {
                //Almacenamos el valor anterior
                operador = "p"
                when (operador) {
                    "p" -> {
                        resultado = (txtResultado?.text.toString().toFloat()/100)
                        txtResultado?.setText(resultado.toString());
                    }
                }
            }

            R.id.buttonIgual->{
                when (operador){
                    "+"->{
                        //Procesamos dentro de la variable
                        resultado = valorAnterior?.toFloat()!! + txtResultado?.text.toString().toFloat()
                        txtResultado?.setText( resultado.toString());
                    }
                    "-"->{
                        resultado = valorAnterior?.toFloat()!! - txtResultado?.text.toString().toFloat()
                        txtResultado?.setText( resultado.toString());
                    }
                    "*"->{
                        resultado = valorAnterior?.toFloat()!! * txtResultado?.text.toString().toFloat()
                        txtResultado?.setText( resultado.toString());
                    }
                    "/"->{
                        resultado = valorAnterior?.toFloat()!! / txtResultado?.text.toString().toFloat()
                        txtResultado?.setText( resultado.toString());
                    }


                }
            }
            R.id.buttonBorrar->{
                var cadena=txtResultado?.text.toString()
                if((cadena!= null) && (!cadena.equals(""))){
                    cadena=cadena.substring(0,cadena.length-1)
                    txtResultado?.setText(cadena)
                }
            }
            R.id.buttonBorrarT->{
                txtResultado?.setText("")
                operador="";
            }
        }
    }


}