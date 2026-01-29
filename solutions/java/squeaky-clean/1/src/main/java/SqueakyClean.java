class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder str = new StringBuilder(identifier);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                str.setCharAt(i, '_');
            }
            else if (ch == '-') {
                str.deleteCharAt(i);
                if (i < str.length()) {
                    str.setCharAt(i,
                        Character.toUpperCase(str.charAt(i)));
                }
                i--; 
            }

            else if (ch == '4' || ch == '3' || ch == '0' || ch == '1' || ch == '7') {
                switch (ch) {
                    case '4': str.setCharAt(i, 'a'); break;
                    case '3': str.setCharAt(i, 'e'); break;
                    case '0': str.setCharAt(i, 'o'); break;
                    case '1': str.setCharAt(i, 'l'); break;
                    case '7': str.setCharAt(i, 't'); break;
                }
            }

            else if (!Character.isLetterOrDigit(ch)) {
                str.deleteCharAt(i);
                i--;
            }
        }

        return str.toString();
    }
}
