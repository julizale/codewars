package org.codewars.leet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testZigZagConvert() {
        //Given
        Solution solution = new Solution();

        //When & Then
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }
    @Test
    void testRotateString() {
        //Given
        Solution solution = new Solution();

        //When & Then
        assertTrue(solution.rotateString("abcde", "abcde"));
        assertTrue(solution.rotateString("abcde", "cdeab"));
        assertTrue(solution.rotateString("abcde", "deabc"));
        assertFalse(solution.rotateString("abcde", "abced"));
    }
    @Test
    void testLengthOfLongestSubstring() {
        //Given
        Solution solution = new Solution();

        //When & Then
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void testRomanToInt() {
        //Given
        Solution solution = new Solution();

        //When & Then
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(1794, solution.romanToInt("MDCCXCIV"));
    }

    @Test
    void testLongestPalindrome() {
        //Given
        Solution solution = new Solution();

        //When & Then
        assertEquals("bab", solution.longestPalindrome("babad"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("ibawpzhrunsgfobmenlqlxnprtgijgbeicsuoihnmcekzmvtffmlpzuwlimuuzjhkzppmpqqrfwyrjrsltkypjpcjffpvhtdiwjdonutobpecsiqubiusvwsyhrddqjeqqpgofifmwvmcdjixjvjxrvyabqaqumfqiiqxizmhzevhxutsbgzcfggyyvolwaxfcpjhfpksxvgyxhddcssnxhygzvmyxrxqizzhpluxkautjmieximoskcffimctsfzgmihtoxkltopwobtfjvjymtuknxmsgevkeklprcaudidywwkfuhtatpeeiewczpwiegmpjquayfleczrvzekikbaeocpcurtxhcsysbbsyschxtrucpcoeabkikezvrzcelfyauqjpmgeiwpzcweieeptathufkwwydiduacrplkekvegsmxnkutmyjvjftbowpotlkxothimgzfstcmiffcksomixeimjtuakxulphzziqxrxymvzgyhxnsscddhxygvxskpfhjpcfxawlovyyggfczgbstuxhvezhmzixqiiqfmuqaqbayvrxjvjxijdcmvwmfifogpqqejqddrhyswvsuibuqiscepbotunodjwidthvpffjcpjpyktlsrjrywfrqqpmppzkhjzuumilwuzplmfftvmzkecmnhiousciebgjigtrpnxlqlnembofgsnurhzpwabi", solution.longestPalindrome("ibawpzhrunsgfobmenlqlxnprtgijgbeicsuoihnmcekzmvtffmlpzuwlimuuzjhkzppmpqqrfwyrjrsltkypjpcjffpvhtdiwjdonutobpecsiqubiusvwsyhrddqjeqqpgofifmwvmcdjixjvjxrvyabqaqumfqiiqxizmhzevhxutsbgzcfggyyvolwaxfcpjhfpksxvgyxhddcssnxhygzvmyxrxqizzhpluxkautjmieximoskcffimctsfzgmihtoxkltopwobtfjvjymtuknxmsgevkeklprcaudidywwkfuhtatpeeiewczpwiegmpjquayfleczrvzekikbaeocpcurtxhcsysbbsyschxtrucpcoeabkikezvrzcelfyauqjpmgeiwpzcweieeptathufkwwydiduacrplkekvegsmxnkutmyjvjftbowpotlkxothimgzfstcmiffcksomixeimjtuakxulphzziqxrxymvzgyhxnsscddhxygvxskpfhjpcfxawlovyyggfczgbstuxhvezhmzixqiiqfmuqaqbayvrxjvjxijdcmvwmfifogpqqejqddrhyswvsuibuqiscepbotunodjwidthvpffjcpjpyktlsrjrywfrqqpmppzkhjzuumilwuzplmfftvmzkecmnhiousciebgjigtrpnxlqlnembofgsnurhzpwabi"));
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        //Given
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);

        //When & Then
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testCountLettersInGoodWords() {
        //Given
        Solution solution = new Solution();
        String[] arr = new String[] {"cat","bt","hat","tree"};

        //When & Then
        assertEquals(6, solution.countCharacters(arr, "atach"));
    }

    @Test
    public void testlongestCommonPrefix() {
        //Given
        Solution solution = new Solution();
        String[] arr1 = new String[] {"cat","bt","hat","tree"};
        String[] arr2 = new String[] {"flower","flow","flight"};
        String[] arr3 = new String[] {"flower","flower","flower","flower","flower"};
        String[] arr4 = new String[] {"a"};

        //When & Then
        assertEquals("", solution.longestCommonPrefix(arr1));
        assertEquals("fl", solution.longestCommonPrefix(arr2));
        assertEquals("flower", solution.longestCommonPrefix(arr3));
        assertEquals("a", solution.longestCommonPrefix(arr4));
    }

    @Test
    public void testTwoSum() {
        //Given
        Solution solution = new Solution();
        int[] arr1 = new int[] {2,7,11,15};
        int[] arr2 = new int[] {3,2,4};
        int[] arr3 = new int[] {3,3};

        //When & Then
        assertTrue(Arrays.stream(solution.twoSum(arr1, 9)).anyMatch(i -> i == 0)
                && Arrays.stream(solution.twoSum(arr1, 9)).anyMatch(i -> i == 1));
        assertTrue(Arrays.stream(solution.twoSum(arr2, 6)).anyMatch(i -> i == 1)
                && Arrays.stream(solution.twoSum(arr2, 6)).anyMatch(i -> i == 2));
        assertTrue(Arrays.stream(solution.twoSum(arr3, 6)).anyMatch(i -> i == 0)
                && Arrays.stream(solution.twoSum(arr3, 6)).anyMatch(i -> i == 1));
    }


}