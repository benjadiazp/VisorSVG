/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.lexer;

import java.io.*;
import postfix.node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private IPushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") final PushbackReader in)
    {
        this.in = new IPushbackReader() {

            private PushbackReader pushbackReader = in;
            
            @Override
            public void unread(int c) throws IOException {
                pushbackReader.unread(c);
            }
            
            @Override
            public int read() throws IOException {
                return pushbackReader.read();
            }
        };
    }
 
    public Lexer(@SuppressWarnings("hiding") IPushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        // int middle = (low + high) / 2;
                        int middle = (low + high) >>> 1;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 22:
                        {
                            @SuppressWarnings("hiding") Token token = new22(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 23:
                        {
                            @SuppressWarnings("hiding") Token token = new23(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 24:
                        {
                            @SuppressWarnings("hiding") Token token = new24(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 25:
                        {
                            @SuppressWarnings("hiding") Token token = new25(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 26:
                        {
                            @SuppressWarnings("hiding") Token token = new26(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 27:
                        {
                            @SuppressWarnings("hiding") Token token = new27(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 28:
                        {
                            @SuppressWarnings("hiding") Token token = new28(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 29:
                        {
                            @SuppressWarnings("hiding") Token token = new29(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 30:
                        {
                            @SuppressWarnings("hiding") Token token = new30(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 31:
                        {
                            @SuppressWarnings("hiding") Token token = new31(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 32:
                        {
                            @SuppressWarnings("hiding") Token token = new32(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 33:
                        {
                            @SuppressWarnings("hiding") Token token = new33(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 34:
                        {
                            @SuppressWarnings("hiding") Token token = new34(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            new InvalidToken(this.text.substring(0, 1), start_line + 1, start_pos + 1),
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TN(text, line, pos); }
    Token new1(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMinus(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMayus(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCo(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIg(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSl(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLine(line, pos); }
    Token new8(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCircle(line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRect(line, pos); }
    Token new10(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEllipse(line, pos); }
    Token new11(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPolygon(line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPolyline(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TX1(line, pos); }
    Token new14(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TY1(line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TX2(line, pos); }
    Token new16(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TY2(line, pos); }
    Token new17(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCx(line, pos); }
    Token new18(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TCy(line, pos); }
    Token new19(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TR0(line, pos); }
    Token new20(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TX0(line, pos); }
    Token new21(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TY0(line, pos); }
    Token new22(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TWidth(line, pos); }
    Token new23(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new THeight(line, pos); }
    Token new24(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRx(line, pos); }
    Token new25(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRy(line, pos); }
    Token new26(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPoints(line, pos); }
    Token new27(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComa(line, pos); }
    Token new28(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TStyle(line, pos); }
    Token new29(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFill(line, pos); }
    Token new30(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TStroke(line, pos); }
    Token new31(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TStrokew(line, pos); }
    Token new32(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TC0(text, line, pos); }
    Token new33(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPc(line, pos); }
    Token new34(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDosp(line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{10, 10, 1}, {13, 13, 2}, {32, 32, 3}, {34, 34, 4}, {44, 44, 5}, {47, 47, 6}, {48, 57, 7}, {58, 58, 8}, {59, 59, 9}, {60, 60, 10}, {61, 61, 11}, {62, 62, 12}, {98, 98, 13}, {99, 99, 14}, {101, 101, 15}, {102, 102, 16}, {103, 103, 17}, {104, 104, 18}, {108, 108, 19}, {110, 110, 20}, {112, 112, 21}, {114, 114, 22}, {115, 115, 23}, {119, 119, 24}, {120, 120, 25}, {121, 121, 26}, },
            {{10, 32, -2}, },
            {{10, 32, -2}, },
            {{10, 32, -2}, },
            {},
            {},
            {},
            {{48, 57, 7}, },
            {},
            {},
            {},
            {},
            {},
            {{108, 108, 27}, {114, 114, 28}, },
            {{105, 105, 29}, {120, 120, 30}, {121, 121, 31}, },
            {{108, 108, 32}, },
            {{105, 105, 33}, },
            {{114, 114, 34}, },
            {{101, 101, 35}, },
            {{105, 105, 36}, },
            {{111, 111, 37}, },
            {{105, 105, 38}, {111, 111, 39}, {117, 117, 40}, },
            {{101, 101, 41}, {120, 120, 42}, {121, 121, 43}, },
            {{107, 107, 44}, {116, 116, 45}, },
            {{104, 104, 46}, {105, 105, 47}, },
            {{49, 49, 48}, {50, 50, 49}, },
            {{49, 49, 50}, {50, 50, 51}, {101, 101, 52}, },
            {{97, 97, 53}, {117, 117, 54}, },
            {{111, 111, 55}, },
            {{114, 114, 56}, },
            {},
            {},
            {{108, 108, 57}, },
            {{108, 108, 58}, },
            {{101, 101, 59}, },
            {{105, 105, 60}, },
            {{109, 109, 61}, {110, 110, 62}, },
            {{110, 110, 63}, },
            {{110, 110, 64}, },
            {{105, 105, 65}, {108, 108, 66}, },
            {{114, 114, 67}, },
            {{99, 99, 68}, {100, 100, 69}, },
            {},
            {},
            {{121, 121, 70}, },
            {{114, 114, 71}, {121, 121, 72}, },
            {{105, 105, 73}, },
            {{100, 100, 74}, },
            {},
            {},
            {},
            {},
            {{108, 108, 75}, },
            {{99, 99, 76}, },
            {{101, 101, 77}, },
            {{119, 119, 78}, },
            {{99, 99, 79}, },
            {{105, 105, 80}, },
            {{108, 108, 81}, },
            {{101, 101, 82}, },
            {{103, 103, 83}, },
            {{101, 101, 84}, },
            {{101, 101, 85}, },
            {{101, 101, 86}, },
            {{107, 107, 87}, },
            {{110, 110, 88}, },
            {{121, 121, 89}, },
            {{112, 112, 90}, },
            {{116, 116, 91}, },
            {},
            {{98, 98, 92}, },
            {{111, 111, 93}, },
            {{108, 108, 94}, },
            {{116, 116, 95}, },
            {{116, 116, 96}, },
            {{108, 108, 97}, },
            {{107, 107, 98}, },
            {},
            {{110, 110, 99}, },
            {{108, 108, 100}, },
            {{112, 112, 101}, },
            {},
            {{110, 110, 102}, },
            {{104, 104, 103}, },
            {},
            {},
            {},
            {},
            {{116, 116, 104}, },
            {{103, 103, 105}, {108, 108, 106}, },
            {{108, 108, 107}, },
            {},
            {{108, 108, 108}, },
            {{107, 107, 109}, },
            {{101, 101, 110}, },
            {{101, 101, 111}, },
            {{104, 104, 112}, },
            {{111, 111, 113}, },
            {},
            {},
            {{101, 101, 114}, },
            {{115, 115, 115}, },
            {},
            {{116, 116, 116}, },
            {{115, 115, 117}, },
            {{111, 111, 118}, },
            {{105, 105, 119}, },
            {{101, 101, 120}, },
            {{117, 117, 121}, },
            {{101, 101, 122}, },
            {},
            {},
            {},
            {{119, 119, 123}, },
            {},
            {{101, 101, 124}, },
            {},
            {},
            {{110, 110, 125}, },
            {{110, 110, 126}, },
            {},
            {{101, 101, 127}, },
            {{45, 45, 128}, },
            {},
            {},
            {},
            {{101, 101, 129}, },
            {},
            {{119, 119, 130}, },
            {},
            {{105, 105, 131}, },
            {{100, 100, 132}, },
            {{116, 116, 133}, },
            {{104, 104, 134}, },
            {},
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 1, 1, 1, 4, 27, 6, 0, 34, 33, 2, 5, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, 19, -1, -1, 20, 21, -1, -1, -1, 17, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, -1, -1, -1, -1, 13, 15, 14, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, 29, -1, -1, 32, 7, 32, 32, -1, -1, -1, 9, -1, -1, -1, -1, -1, -1, 32, 32, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, 28, 32, 22, -1, 8, -1, 23, 26, -1, -1, 32, -1, 30, 32, 10, 11, -1, 32, -1, 12, -1, -1, -1, -1, 31, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}
