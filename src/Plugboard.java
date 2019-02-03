public class Plugboard {

    private Character[] attr_swap = new Character[10];


    // decide on your instance variables to represent the plugboard
    // NOTE:  you need to be able to map and reverse-map
    //        (remember the direction of flow when discussed in class)
    
    // swaps is a string with upto 10 pairs of characters to swap (eg. "ajqzbw")
    public Plugboard(Character[] swaps) {
	     //might not need this, the argument might be enough try both
        // these are checks to make sure swaps is entered correctly
        attr_swap = swaps;
//        if (swaps.length % 2 == 1)
//            System.out.println("Error: characters must be mapped in pairs, please enter an even amount of characters:");
//        else if (swaps.length > 10)
//            System.out.println("Error: please enter in a max of 10 pairs:");
//        else
            for (int i = 0; i < swaps.length; i++) {
                switching[i] = swaps[i];
                System.out.println(switching[i]);
            }

            System.out.println("wow nice"); // check if running


    }

    // encode one character through the plugboard
    // (you may assume that ch is a valid character in range ['a', 'z']
    public char encode(char ch) {
        //this should take the character value and if it is present in an even index it will change the value of ch
        // this needs to be tested
        for (int inc = 0; inc < attr_swap.length; inc += 2) {
            if (ch == attr_swap[inc]) {
                ch = attr_swap[inc + 1];
            }
        }
        System.out.println(ch + "\n");
        return ch;   // CHANGE THIS, JUST HERE IN ORDER TO COMPILE
    }



    // decode one character through the plugboard
    // (you may assume that ch is a valid character in range ['a', 'z']
    public char decode(char ch) {
        // exact same procedure just on every odd entry of the array
        for (int inc = 1; inc < attr_swap.length; inc += 2) {
            if (ch == attr_swap[inc]) {
                ch = attr_swap[inc - 1];
            }
        }
        System.out.println(ch + "\n");
	return ch;   // CHANGE THIS, JUST HERE IN ORDER TO COMPILE
    }
}
