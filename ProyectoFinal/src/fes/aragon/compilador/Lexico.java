/* The following code was generated by JFlex 1.4_pre3 on 06/05/22 14:31 */

package fes.aragon.compilador;
import java_cup.runtime.Symbol;
import java.io.Reader;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4_pre3
 * on 06/05/22 14:31 from the specification file
 * <tt>file:/C:/Users/Usuario/Desktop/ProyectoFinal/ProyectoFinal/Fuente_lexico.flex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int YY_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] yycmap = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 24, 24,  0, 24, 24,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    24,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0, 14,  0,  0,  0,  0, 
     0, 10, 16, 11, 20,  3,  8,  0, 21,  6, 17,  0, 13, 15,  0, 12, 
     4, 19,  2,  0,  5,  9,  7,  0,  0,  0, 18,  0,  0,  0,  0,  0, 
     0, 10, 16, 11, 20,  3,  8,  0, 21,  6, 17,  0, 13, 15,  0, 12, 
     4, 19,  2,  0,  5,  9,  7,  0,  0,  0, 18, 22,  0, 23,  0,  0
  };


  /** 
   * Translates a state to a row index in the transition table (packed version)
   */
  final private static String yy_rowMap_packed = 
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\257\0\310\0\31"+
    "\0\341\0\372\0\31\0\31\0\31\0\u0113\0\u012c\0\u0145\0\u015e\0\u0177"+
    "\0\u0190\0\u01a9\0\u01c2\0\u01db\0\u01f4\0\u020d\0\31\0\u0226\0\u023f\0\u0258"+
    "\0\u0271\0\u028a\0\u02a3\0\u02bc\0\u02d5\0\u02ee\0\u0307\0\u0320\0\u0339\0\u0352"+
    "\0\u036b\0\u0384\0\u039d\0\31\0\u03b6\0\31\0\u03cf\0\31\0\u03e8\0\u0401"+
    "\0\u041a\0\31\0\31\0\u0433\0\31\0\u044c\0\31\0\u0465\0\31";

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int [] yy_rowMap = yy_unpack_rowMap(yy_rowMap_packed);


  /** 
   * Unpacks the compressed row translation table.
   *
   * @param packed   the packed row translation table
   * @return         the unpacked row translation table
   */
  private static int [] yy_unpack_rowMap(String packed) {
    int [] map = new int[118];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 118) {
      int high = ((int) packed.charAt(i++)) << 16;
      map[j++] = high | packed.charAt(i++);
    }
    return map;
  }
  /** 
   * The packed transition table of the DFA (part 0)
   */
  private static final String yy_packed0 = 
    "\1\2\1\3\1\4\3\2\1\5\1\6\1\7\1\2"+
    "\1\10\1\11\2\2\1\12\1\13\4\2\1\14\1\2"+
    "\1\15\1\16\1\17\32\0\1\3\32\0\1\20\47\0"+
    "\1\21\11\0\1\22\27\0\1\23\30\0\1\24\15\0"+
    "\1\25\24\0\1\26\30\0\1\27\17\0\1\30\31\0"+
    "\1\31\47\0\1\32\7\0\1\33\37\0\1\34\21\0"+
    "\1\35\40\0\1\36\33\0\1\37\22\0\1\40\23\0"+
    "\1\41\31\0\1\42\36\0\1\43\24\0\1\44\31\0"+
    "\1\45\43\0\1\46\23\0\1\47\17\0\1\50\30\0"+
    "\1\51\32\0\1\52\31\0\1\53\34\0\1\54\36\0"+
    "\1\55\24\0\1\56\27\0\1\57\17\0\1\60\41\0"+
    "\1\61\23\0\1\62\25\0\1\63\37\0\1\64\30\0"+
    "\1\65\43\0\1\66\5\0\1\67\30\0\1\70\40\0"+
    "\1\71\42\0\1\72\16\0\1\73\16\0";

  /** 
   * The transition table of the DFA
   */
  private static final int yytrans [] = yy_unpack();


  /* error codes */
  private static final int YY_UNKNOWN_ERROR = 0;
  private static final int YY_ILLEGAL_STATE = 1;
  private static final int YY_NO_MATCH = 2;
  private static final int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  private static final String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final byte YY_ATTRIBUTE[] = {
     0,  9,  1,  1,  1,  1,  1,  1,  1,  9,  1,  1,  9,  9,  9,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  0,  9,  0,  9, 
     0,  0,  0,  9,  9,  0,  9,  0,  9,  0,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	public int getYyline() {
                return yyline;
        }

        public int getYy_currentPos() {
            return yy_currentPos-1;
        }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[1150];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
          }
          break;
        default:
          yy_r = false;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 1: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 10: 
        case 11: 
          {  System.out.println("Caracter no valido. "+yytext()+"-");  }
        case 60: break;
        case 54: 
          { System.out.println("repetir"); return new Symbol(sym.REPETIR);  }
        case 61: break;
        case 52: 
          { System.out.println("coloca"); return new Symbol(sym.COLOCA);  }
        case 62: break;
        case 51: 
          { System.out.println("arriba"); return new Symbol(sym.ARRIBA);  }
        case 63: break;
        case 47: 
          { System.out.println("mover"); return new Symbol(sym.MOVER);  }
        case 64: break;
        case 45: 
          { System.out.println("abajo"); return new Symbol(sym.ABAJO);  }
        case 65: break;
        case 12: 
          { System.out.println("para"); return new Symbol(sym.PARA);  }
        case 66: break;
        case 26: 
          { System.out.println("ver"); return new Symbol(sym.VER);  }
        case 67: break;
        case 43: 
          { System.out.println("fruta"); return new Symbol(sym.FRUTA);  }
        case 68: break;
        case 58: 
          { System.out.println("izquierda"); return new Symbol(sym.IZQ);  }
        case 69: break;
        case 2: 
          { 
		System.out.println(yytext()+"");
		return new Symbol(sym.NUMERO, new Integer(yytext()));  }
        case 70: break;
        case 13: 
          {  System.out.println("parc");return new Symbol(sym.PARC);  }
        case 71: break;
        case 56: 
          { System.out.println("derecha"); return new Symbol(sym.DER);  }
        case 72: break;
        case 14: 
          {  }
        case 73: break;
        case 9: 
          { System.out.println("puntocoma"); return new Symbol(sym.PUNTOYCOMA);  }
        case 74: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {  return new Symbol(sym.EOF,new String("Fin del archivo"));
//return null;
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
