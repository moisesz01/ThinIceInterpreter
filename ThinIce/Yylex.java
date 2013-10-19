/* The following code was generated by JFlex 1.4.3 on 18/10/13 07:37 AM */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 18/10/13 07:37 AM from the specification file
 * <tt>D:/workspace/ThinIce/lexico.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1, 18,  0,  0,  0,  0,  0,  0, 21, 22, 11,  9,  0, 10,  0, 12, 
    37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 14,  8, 19, 15, 20,  0, 
     0, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 17, 
    38, 38, 38, 38, 38, 38, 38, 38, 38, 16, 38, 25,  0, 26,  0,  0, 
     0,  6, 33, 38, 13, 30, 36,  5, 32, 28, 38, 38, 34,  7, 29,  4, 
     2, 38,  3, 27, 31, 35, 38, 38, 38, 38, 38, 23,  0, 24,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\4\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\0\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\6\2\1\24\4\2"+
    "\1\25\1\26\1\27\1\30\1\31\10\2\1\32\7\2"+
    "\1\33\1\2\1\34\1\2\1\35\6\2\1\36\1\2"+
    "\1\37\1\2\1\40\1\41\2\2\1\42\1\2\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0111\0\u0111\0\u0111\0\u0111\0\u0138\0\u0111\0\303\0\303"+
    "\0\u0111\0\u015f\0\u0186\0\u0111\0\u0111\0\u0111\0\u0111\0\u0111"+
    "\0\u0111\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297"+
    "\0\u02be\0\u02e5\0\u030c\0\u0333\0\u0111\0\u0111\0\u0111\0\u0111"+
    "\0\u035a\0\u0381\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444\0\u046b"+
    "\0\u0492\0\303\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c"+
    "\0\u05a3\0\303\0\u05ca\0\303\0\u05f1\0\303\0\u0618\0\u063f"+
    "\0\u0666\0\u068d\0\u06b4\0\u06db\0\303\0\u0702\0\303\0\u0729"+
    "\0\303\0\303\0\u0750\0\u0777\0\303\0\u079e\0\303";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\3\1\4\1\5\3\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\6\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\2\6\1\33\1\34\1\35\1\36\2\6"+
    "\1\37\1\40\1\6\1\0\1\3\1\41\1\5\3\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\6\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\2\6\1\33\1\34"+
    "\1\35\1\36\2\6\1\37\1\40\1\6\1\0\1\3"+
    "\47\0\4\6\1\42\1\6\5\0\1\6\2\0\2\6"+
    "\11\0\12\6\1\0\1\6\2\0\6\6\5\0\1\6"+
    "\2\0\2\6\11\0\3\6\1\43\6\6\1\0\1\6"+
    "\2\0\6\6\5\0\1\6\2\0\2\6\11\0\12\6"+
    "\1\0\1\6\2\0\2\6\1\44\3\6\5\0\1\6"+
    "\2\0\2\6\11\0\12\6\1\0\1\6\66\0\1\45"+
    "\46\0\1\46\4\0\1\47\41\0\1\50\31\0\6\6"+
    "\5\0\1\6\2\0\2\6\11\0\1\6\1\51\10\6"+
    "\1\0\1\6\2\0\6\6\5\0\1\6\2\0\2\6"+
    "\11\0\2\6\1\52\7\6\1\0\1\6\2\0\1\6"+
    "\1\53\4\6\5\0\1\6\2\0\2\6\11\0\12\6"+
    "\1\0\1\6\2\0\4\6\1\54\1\6\5\0\1\6"+
    "\2\0\2\6\11\0\12\6\1\0\1\6\2\0\2\6"+
    "\1\55\3\6\5\0\1\6\2\0\2\6\11\0\12\6"+
    "\1\0\1\6\2\0\4\6\1\56\1\6\5\0\1\6"+
    "\2\0\2\6\11\0\12\6\1\0\1\6\45\0\1\40"+
    "\3\0\1\6\1\57\2\6\1\42\1\6\5\0\1\6"+
    "\2\0\2\6\11\0\12\6\1\0\1\6\2\0\1\6"+
    "\1\60\4\6\5\0\1\6\2\0\2\6\11\0\12\6"+
    "\1\0\1\6\2\0\1\61\5\6\5\0\1\6\2\0"+
    "\2\6\11\0\12\6\1\0\1\6\2\0\6\6\5\0"+
    "\1\62\2\0\2\6\11\0\12\6\1\0\1\6\2\0"+
    "\6\6\5\0\1\6\2\0\2\6\11\0\2\6\1\63"+
    "\7\6\1\0\1\6\2\0\6\6\5\0\1\6\2\0"+
    "\2\6\11\0\4\6\1\64\5\6\1\0\1\6\2\0"+
    "\6\6\5\0\1\6\2\0\2\6\11\0\10\6\1\65"+
    "\1\6\1\0\1\6\2\0\6\6\5\0\1\6\2\0"+
    "\2\6\11\0\1\66\11\6\1\0\1\6\2\0\2\6"+
    "\1\67\3\6\5\0\1\6\2\0\2\6\11\0\12\6"+
    "\1\0\1\6\2\0\6\6\5\0\1\6\2\0\2\6"+
    "\11\0\7\6\1\70\2\6\1\0\1\6\2\0\2\6"+
    "\1\71\3\6\5\0\1\6\2\0\2\6\11\0\12\6"+
    "\1\0\1\6\2\0\4\6\1\72\1\6\5\0\1\6"+
    "\2\0\2\6\11\0\12\6\1\0\1\6\2\0\6\6"+
    "\5\0\1\6\2\0\2\6\11\0\1\6\1\73\10\6"+
    "\1\0\1\6\2\0\2\6\1\74\3\6\5\0\1\6"+
    "\2\0\2\6\11\0\12\6\1\0\1\6\2\0\6\6"+
    "\5\0\1\6\2\0\2\6\11\0\3\6\1\75\6\6"+
    "\1\0\1\6\2\0\6\6\5\0\1\6\2\0\2\6"+
    "\11\0\3\6\1\76\6\6\1\0\1\6\2\0\6\6"+
    "\5\0\1\6\2\0\2\6\11\0\4\6\1\77\5\6"+
    "\1\0\1\6\2\0\6\6\5\0\1\6\2\0\2\6"+
    "\11\0\7\6\1\100\2\6\1\0\1\6\2\0\6\6"+
    "\5\0\1\6\2\0\2\6\11\0\1\101\11\6\1\0"+
    "\1\6\2\0\3\6\1\102\2\6\5\0\1\6\2\0"+
    "\2\6\11\0\12\6\1\0\1\6\2\0\6\6\5\0"+
    "\1\6\2\0\2\6\11\0\4\6\1\103\5\6\1\0"+
    "\1\6\2\0\1\6\1\104\4\6\5\0\1\6\2\0"+
    "\2\6\11\0\12\6\1\0\1\6\2\0\4\6\1\105"+
    "\1\6\5\0\1\6\2\0\2\6\11\0\12\6\1\0"+
    "\1\6\2\0\6\6\5\0\1\6\2\0\2\6\11\0"+
    "\3\6\1\106\6\6\1\0\1\6\2\0\6\6\5\0"+
    "\1\6\2\0\2\6\11\0\3\6\1\107\6\6\1\0"+
    "\1\6\2\0\1\6\1\110\4\6\5\0\1\6\2\0"+
    "\2\6\11\0\12\6\1\0\1\6\2\0\4\6\1\111"+
    "\1\6\5\0\1\6\2\0\2\6\11\0\12\6\1\0"+
    "\1\6\2\0\2\6\1\112\3\6\5\0\1\6\2\0"+
    "\2\6\11\0\12\6\1\0\1\6\2\0\4\6\1\113"+
    "\1\6\5\0\1\6\2\0\2\6\11\0\12\6\1\0"+
    "\1\6\2\0\4\6\1\114\1\6\5\0\1\6\2\0"+
    "\2\6\11\0\12\6\1\0\1\6\2\0\6\6\5\0"+
    "\1\6\2\0\2\6\11\0\2\6\1\115\7\6\1\0"+
    "\1\6\2\0\5\6\1\116\5\0\1\6\2\0\2\6"+
    "\11\0\12\6\1\0\1\6\2\0\4\6\1\117\1\6"+
    "\5\0\1\6\2\0\2\6\11\0\12\6\1\0\1\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1989];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\5\1\5\11\1\0\1\11\2\1\1\11\2\1"+
    "\6\11\13\1\4\11\47\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
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
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL[zzMarkedPosL-1]) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { return new Symbol(sym.OP_RESTA);
          }
        case 36: break;
        case 35: 
          { return new Symbol(sym.PROGRAMA);
          }
        case 37: break;
        case 26: 
          { return new Symbol(sym.OP_MODU);
          }
        case 38: break;
        case 31: 
          { return new Symbol(sym.BOOL,new boolean(false));
          }
        case 39: break;
        case 2: 
          { return new Symbol(sym.ID,new String(yytext()));
          }
        case 40: break;
        case 9: 
          { return new Symbol(sym.OP_CONJ);
          }
        case 41: break;
        case 14: 
          { return new Symbol(sym.PAR_IZ);
          }
        case 42: break;
        case 7: 
          { return new Symbol(sym.OP_DIVI);
          }
        case 43: break;
        case 27: 
          { return new Symbol(sym.PAR_PARA);
          }
        case 44: break;
        case 25: 
          { return new Symbol(sym.SI);
          }
        case 45: break;
        case 10: 
          { return new Symbol(sym.OP_DISJ);
          }
        case 46: break;
        case 6: 
          { return new Symbol(sym.OP_MULTI);
          }
        case 47: break;
        case 32: 
          { return new Symbol(sym.REPITA);
          }
        case 48: break;
        case 8: 
          { return new Symbol(sym.IGUAL);
          }
        case 49: break;
        case 19: 
          { return new Symbol(sym.COR_DE);
          }
        case 50: break;
        case 17: 
          { return new Symbol(sym.LLA_DE);
          }
        case 51: break;
        case 21: 
          { return new Symbol(sym.ASIGNA);
          }
        case 52: break;
        case 3: 
          { return new Symbol(sym.PCOMA);
          }
        case 53: break;
        case 12: 
          { return new Symbol(sym.MENOR);
          }
        case 54: break;
        case 33: 
          { return new Symbol(sym.TIPOENTERO);
          }
        case 55: break;
        case 28: 
          { return new Symbol(sym.SINO);
          }
        case 56: break;
        case 24: 
          { return new Symbol(sym.MAYOR_IGUAL);
          }
        case 57: break;
        case 22: 
          { return new Symbol(sym.MENOR_IGUAL);
          }
        case 58: break;
        case 34: 
          { return new Symbol(sym.TIPOBOOL);
          }
        case 59: break;
        case 30: 
          { return new Symbol(sym.HASTA);
          }
        case 60: break;
        case 20: 
          { return new Symbol(sym.ENTERO,new Integer(yytext()));
          }
        case 61: break;
        case 4: 
          { return new Symbol(sym.OP_SUMA);
          }
        case 62: break;
        case 23: 
          { return new Symbol(sym.DIFERENTE);
          }
        case 63: break;
        case 29: 
          { return new Symbol(sym.BOOL,new boolean(true));
          }
        case 64: break;
        case 18: 
          { return new Symbol(sym.COR_IZ);
          }
        case 65: break;
        case 13: 
          { return new Symbol(sym.MAYOR);
          }
        case 66: break;
        case 11: 
          { return new Symbol(sym.OP_NEG);
          }
        case 67: break;
        case 15: 
          { return new Symbol(sym.PAR_DE);
          }
        case 68: break;
        case 16: 
          { return new Symbol(sym.LLA_IZ);
          }
        case 69: break;
        case 1: 
          { 
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
