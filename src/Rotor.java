public class Rotor {
    // this counter is here to keep track of advance
    private int counter = 1;
    // this constant is the reference array for mapping to the alphaperm
    private static final char[] ALPHABET_INDEX = {'a','b','c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s','t','u', 'v', 'w', 'x','y', 'z'};

    // The parameter alphaperm below is a permutation of ['a','z']
    // startpos is the starting position of the rotor

    // what I need to do here /////
    // need to use startpos to get an index value that can set the starting position of alphaperm can accomplish with binary or linear search
    // then the found index is the starting position in the permutation
    public Rotor(Character[] alphaperm, char startpos) {
        // this is a linear search to find the starting position of alpha perm
        for (int i = 0; i < alphaperm.length; i++){
            if (startpos == alphaperm[i]) {
                int up = i;
                break;
            }
        }

        // place code here
    }

    // encode one character, ch, according to the rotor "wiring"
    public char encode(char ch) {
        // this is a linear search to find the index equivalent of incoming character to map to the permutation
        for (int i = 0; i < ALPHABET_INDEX.length; i++){
            if (ch == ALPHABET_INDEX[i]) {
                int initial = i;
                break;
            }
        }
        // actually need to map it
        // then find the way to make advance increment the array based on a modulus to repeat
        // encode is going to take alphaperm inital
        return '\0';   // CHANGE THIS, JUST HERE TO COMPILE
    }

    // decode one character, ch, according to the rotor "wiring" (reverse dir)
    public char decode(char ch) {
	return '\0';   // CHANGE THIS, JUST HERE TO COMPILE
    }

    /*
       advance the roter one position.  Think about what instance
       variable(s) you need to keep track of this.  This method
       returns true of the rotor has made a complete turn; otherwise
       false
    */
    // every time this is called mod track is incremented, and if is mod 27 return true
    // first rotor will then increment when true
    // second rotor if rotor 1 returns true 27 times
    //things that are unclear so far how can this account for the first rotor always turning and the others only turning every rotation
    // solvable if for the first rotor you create a helper method that calls advance 26 times LOL
    // first rotor will trigger index shift if true or false in enigma SOLVED HERE
    // and in same conditional body if rotor 2 is true index shift and the same process for rotor 3
    public boolean advance() {
                this.counter++;
            if (this.counter % 27 == 0)
                return true;
            else
                return false;
	    // CHANGE THIS, JUST HERE TO COMPILE
    }

    // reset the starting position for the rotor
    public void reset(char startpos) {
	// place code here
    }
}
