<h2><a href="https://leetcode.com/problems/valid-palindrome-ii">680. Valid Palindrome II</a></h2><h3>Easy</h3><hr><p>Given a string <code>s</code>, return <code>true</code> <em>if the </em><code>s</code><em> can be palindrome after deleting <strong>at most one</strong> character from it</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aba&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abca&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong> You could delete the character &#39;c&#39;.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abc&quot;
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0011-container-with-most-water) |
| [0014-longest-common-prefix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0014-longest-common-prefix) |
| [0015-3sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0015-3sum) |
| [0018-4sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0018-4sum) |
| [0027-remove-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0031-next-permutation) |
| [0033-search-in-rotated-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0035-search-insert-position) |
| [0037-sudoku-solver](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0037-sudoku-solver) |
| [0039-combination-sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0039-combination-sum) |
| [0040-combination-sum-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0040-combination-sum-ii) |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0046-permutations](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0046-permutations) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0051-n-queens](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0051-n-queens) |
| [0053-maximum-subarray](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0053-maximum-subarray) |
| [0054-spiral-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0054-spiral-matrix) |
| [0056-merge-intervals](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0056-merge-intervals) |
| [0073-set-matrix-zeroes](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0073-set-matrix-zeroes) |
| [0074-search-a-2d-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0074-search-a-2d-matrix) |
| [0075-sort-colors](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0075-sort-colors) |
| [0078-subsets](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0078-subsets) |
| [0088-merge-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0088-merge-sorted-array) |
| [0090-subsets-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0090-subsets-ii) |
| [0136-single-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0136-single-number) |
| [0137-single-number-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0137-single-number-ii) |
| [0150-evaluate-reverse-polish-notation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0150-evaluate-reverse-polish-notation) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
| [0189-rotate-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0189-rotate-array) |
| [0238-product-of-array-except-self](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0238-product-of-array-except-self) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0260-single-number-iii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0260-single-number-iii) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0318-maximum-product-of-word-lengths](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0318-maximum-product-of-word-lengths) |
| [0496-next-greater-element-i](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0496-next-greater-element-i) |
| [0540-single-element-in-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0540-single-element-in-a-sorted-array) |
| [0560-subarray-sum-equals-k](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0560-subarray-sum-equals-k) |
| [0566-reshape-the-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0566-reshape-the-matrix) |
| [0628-maximum-product-of-three-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0628-maximum-product-of-three-numbers) |
| [0704-binary-search](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0704-binary-search) |
| [0739-daily-temperatures](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0739-daily-temperatures) |
| [0852-peak-index-in-a-mountain-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0852-peak-index-in-a-mountain-array) |
| [0896-monotonic-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0896-monotonic-array) |
| [0898-transpose-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0898-transpose-matrix) |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
| [0941-sort-array-by-parity](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0941-sort-array-by-parity) |
| [0977-squares-of-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0977-squares-of-a-sorted-array) |
| [1295-find-numbers-with-even-number-of-digits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1295-find-numbers-with-even-number-of-digits) |
| [1470-shuffle-the-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1470-shuffle-the-array) |
| [1677-matrix-diagonal-sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1677-matrix-diagonal-sum) |
| [1791-richest-customer-wealth](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1791-richest-customer-wealth) |
| [2073-time-needed-to-buy-tickets](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2073-time-needed-to-buy-tickets) |
| [2150-find-all-lonely-numbers-in-the-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2150-find-all-lonely-numbers-in-the-array) |
| [2190-most-frequent-number-following-key-in-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2190-most-frequent-number-following-key-in-an-array) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
| [2596-check-knight-tour-configuration](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2596-check-knight-tour-configuration) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Math
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0002-add-two-numbers) |
| [0050-powx-n](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0050-powx-n) |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0150-evaluate-reverse-polish-notation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0150-evaluate-reverse-polish-notation) |
| [0189-rotate-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0189-rotate-array) |
| [0231-power-of-two](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0231-power-of-two) |
| [0326-power-of-three](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0342-power-of-four) |
| [0371-sum-of-two-integers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0371-sum-of-two-integers) |
| [0390-elimination-game](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0390-elimination-game) |
| [0628-maximum-product-of-three-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0628-maximum-product-of-three-numbers) |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
| [1295-find-numbers-with-even-number-of-digits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1295-find-numbers-with-even-number-of-digits) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0015-3sum) |
| [0018-4sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0018-4sum) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0056-merge-intervals](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0056-merge-intervals) |
| [0075-sort-colors](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0088-merge-sorted-array) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
| [0242-valid-anagram](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0242-valid-anagram) |
| [0628-maximum-product-of-three-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0628-maximum-product-of-three-numbers) |
| [0807-custom-sort-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0807-custom-sort-string) |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
| [0941-sort-array-by-parity](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0941-sort-array-by-parity) |
| [0977-squares-of-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0977-squares-of-a-sorted-array) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
## Matrix
|  |
| ------- |
| [0037-sudoku-solver](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0037-sudoku-solver) |
| [0054-spiral-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0054-spiral-matrix) |
| [0073-set-matrix-zeroes](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0073-set-matrix-zeroes) |
| [0074-search-a-2d-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0074-search-a-2d-matrix) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0566-reshape-the-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0566-reshape-the-matrix) |
| [0898-transpose-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0898-transpose-matrix) |
| [1677-matrix-diagonal-sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1677-matrix-diagonal-sum) |
| [1791-richest-customer-wealth](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1791-richest-customer-wealth) |
| [2596-check-knight-tour-configuration](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2596-check-knight-tour-configuration) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Simulation
|  |
| ------- |
| [0054-spiral-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0054-spiral-matrix) |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0566-reshape-the-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0566-reshape-the-matrix) |
| [0898-transpose-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0898-transpose-matrix) |
| [1910-remove-all-occurrences-of-a-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1910-remove-all-occurrences-of-a-substring) |
| [2073-time-needed-to-buy-tickets](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2073-time-needed-to-buy-tickets) |
| [2596-check-knight-tour-configuration](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2596-check-knight-tour-configuration) |
## String
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0003-longest-substring-without-repeating-characters) |
| [0008-string-to-integer-atoi](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0008-string-to-integer-atoi) |
| [0014-longest-common-prefix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0014-longest-common-prefix) |
| [0020-valid-parentheses](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0020-valid-parentheses) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0071-simplify-path](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0071-simplify-path) |
| [0076-minimum-window-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0076-minimum-window-substring) |
| [0131-palindrome-partitioning](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0131-palindrome-partitioning) |
| [0151-reverse-words-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0151-reverse-words-in-a-string) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
| [0242-valid-anagram](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0242-valid-anagram) |
| [0318-maximum-product-of-word-lengths](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0318-maximum-product-of-word-lengths) |
| [0387-first-unique-character-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0387-first-unique-character-in-a-string) |
| [0443-string-compression](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0443-string-compression) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
| [0709-to-lower-case](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0709-to-lower-case) |
| [0807-custom-sort-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0807-custom-sort-string) |
| [1108-defanging-an-ip-address](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1108-defanging-an-ip-address) |
| [1309-decrypt-string-from-alphabet-to-integer-mapping](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1309-decrypt-string-from-alphabet-to-integer-mapping) |
| [1910-remove-all-occurrences-of-a-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1910-remove-all-occurrences-of-a-substring) |
## Bit Manipulation
|  |
| ------- |
| [0067-add-binary](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0067-add-binary) |
| [0078-subsets](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0078-subsets) |
| [0090-subsets-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0090-subsets-ii) |
| [0136-single-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0136-single-number) |
| [0137-single-number-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0137-single-number-ii) |
| [0191-number-of-1-bits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0191-number-of-1-bits) |
| [0201-bitwise-and-of-numbers-range](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0201-bitwise-and-of-numbers-range) |
| [0231-power-of-two](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0231-power-of-two) |
| [0260-single-number-iii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0260-single-number-iii) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0318-maximum-product-of-word-lengths](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0318-maximum-product-of-word-lengths) |
| [0338-counting-bits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0338-counting-bits) |
| [0342-power-of-four](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0342-power-of-four) |
| [0371-sum-of-two-integers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0371-sum-of-two-integers) |
| [0461-hamming-distance](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0461-hamming-distance) |
| [2220-minimum-bit-flips-to-convert-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2220-minimum-bit-flips-to-convert-number) |
## Divide and Conquer
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0023-merge-k-sorted-lists) |
| [0053-maximum-subarray](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0053-maximum-subarray) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0191-number-of-1-bits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0191-number-of-1-bits) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
## Hash Table
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0003-longest-substring-without-repeating-characters) |
| [0037-sudoku-solver](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0037-sudoku-solver) |
| [0049-group-anagrams](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0049-group-anagrams) |
| [0073-set-matrix-zeroes](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0073-set-matrix-zeroes) |
| [0076-minimum-window-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0076-minimum-window-substring) |
| [0141-linked-list-cycle](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0142-linked-list-cycle-ii) |
| [0160-intersection-of-two-linked-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0160-intersection-of-two-linked-lists) |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0242-valid-anagram](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0242-valid-anagram) |
| [0387-first-unique-character-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0387-first-unique-character-in-a-string) |
| [0496-next-greater-element-i](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0496-next-greater-element-i) |
| [0560-subarray-sum-equals-k](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0560-subarray-sum-equals-k) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
| [0807-custom-sort-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0807-custom-sort-string) |
| [2150-find-all-lonely-numbers-in-the-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2150-find-all-lonely-numbers-in-the-array) |
| [2190-most-frequent-number-following-key-in-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2190-most-frequent-number-following-key-in-an-array) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
| [2965-find-missing-and-repeated-values](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2965-find-missing-and-repeated-values) |
## Binary Search
|  |
| ------- |
| [0033-search-in-rotated-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0035-search-insert-position) |
| [0074-search-a-2d-matrix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0074-search-a-2d-matrix) |
| [0240-search-a-2d-matrix-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0240-search-a-2d-matrix-ii) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0540-single-element-in-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0540-single-element-in-a-sorted-array) |
| [0704-binary-search](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0704-binary-search) |
| [0852-peak-index-in-a-mountain-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0852-peak-index-in-a-mountain-array) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0015-3sum) |
| [0018-4sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0018-4sum) |
| [0027-remove-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0027-remove-element) |
| [0031-next-permutation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0031-next-permutation) |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0061-rotate-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0061-rotate-list) |
| [0075-sort-colors](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0088-merge-sorted-array) |
| [0141-linked-list-cycle](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0142-linked-list-cycle-ii) |
| [0151-reverse-words-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0151-reverse-words-in-a-string) |
| [0160-intersection-of-two-linked-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0160-intersection-of-two-linked-lists) |
| [0189-rotate-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0189-rotate-array) |
| [0234-palindrome-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0234-palindrome-linked-list) |
| [0287-find-the-duplicate-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0287-find-the-duplicate-number) |
| [0443-string-compression](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0443-string-compression) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
| [0876-middle-of-the-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0876-middle-of-the-linked-list) |
| [0941-sort-array-by-parity](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0941-sort-array-by-parity) |
| [0977-squares-of-a-sorted-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0977-squares-of-a-sorted-array) |
| [1721-swapping-nodes-in-a-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1721-swapping-nodes-in-a-linked-list) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0011-container-with-most-water) |
| [0179-largest-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0179-largest-number) |
## Dynamic Programming
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0053-maximum-subarray) |
| [0131-palindrome-partitioning](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0131-palindrome-partitioning) |
| [0338-counting-bits](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0338-counting-bits) |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0002-add-two-numbers) |
| [0021-merge-two-sorted-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0021-merge-two-sorted-lists) |
| [0050-powx-n](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0050-powx-n) |
| [0203-remove-linked-list-elements](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0203-remove-linked-list-elements) |
| [0206-reverse-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0206-reverse-linked-list) |
| [0231-power-of-two](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0231-power-of-two) |
| [0234-palindrome-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0234-palindrome-linked-list) |
| [0326-power-of-three](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0342-power-of-four) |
| [0390-elimination-game](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0390-elimination-game) |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
## Memoization
|  |
| ------- |
| [1013-fibonacci-number](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1013-fibonacci-number) |
## Enumeration
|  |
| ------- |
| [2215-finding-3-digit-even-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2215-finding-3-digit-even-numbers) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0020-valid-parentheses) |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0071-simplify-path](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0071-simplify-path) |
| [0150-evaluate-reverse-polish-notation](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0150-evaluate-reverse-polish-notation) |
| [0155-min-stack](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0155-min-stack) |
| [0225-implement-stack-using-queues](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0225-implement-stack-using-queues) |
| [0232-implement-queue-using-stacks](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0232-implement-queue-using-stacks) |
| [0234-palindrome-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0234-palindrome-linked-list) |
| [0496-next-greater-element-i](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0496-next-greater-element-i) |
| [0739-daily-temperatures](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0739-daily-temperatures) |
| [1910-remove-all-occurrences-of-a-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1910-remove-all-occurrences-of-a-substring) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0042-trapping-rain-water) |
| [0496-next-greater-element-i](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0496-next-greater-element-i) |
| [0739-daily-temperatures](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0739-daily-temperatures) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0169-majority-element) |
| [0387-first-unique-character-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0387-first-unique-character-in-a-string) |
| [2150-find-all-lonely-numbers-in-the-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2150-find-all-lonely-numbers-in-the-array) |
| [2190-most-frequent-number-following-key-in-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2190-most-frequent-number-following-key-in-an-array) |
## Sliding Window
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0003-longest-substring-without-repeating-characters) |
| [0076-minimum-window-substring](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0076-minimum-window-substring) |
| [0567-permutation-in-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0567-permutation-in-string) |
## Prefix Sum
|  |
| ------- |
| [0238-product-of-array-except-self](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0238-product-of-array-except-self) |
| [0560-subarray-sum-equals-k](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0560-subarray-sum-equals-k) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0014-longest-common-prefix) |
## Backtracking
|  |
| ------- |
| [0037-sudoku-solver](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0037-sudoku-solver) |
| [0039-combination-sum](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0039-combination-sum) |
| [0040-combination-sum-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0040-combination-sum-ii) |
| [0046-permutations](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0046-permutations) |
| [0051-n-queens](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0051-n-queens) |
| [0078-subsets](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0078-subsets) |
| [0090-subsets-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0090-subsets-ii) |
| [0131-palindrome-partitioning](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0131-palindrome-partitioning) |
## Depth-First Search
|  |
| ------- |
| [2596-check-knight-tour-configuration](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2596-check-knight-tour-configuration) |
## Breadth-First Search
|  |
| ------- |
| [2596-check-knight-tour-configuration](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2596-check-knight-tour-configuration) |
## Heap (Priority Queue)
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0023-merge-k-sorted-lists) |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
## Merge Sort
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0023-merge-k-sorted-lists) |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
## Bucket Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
## Radix Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
## Counting Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0912-sort-an-array) |
## Linked List
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0002-add-two-numbers) |
| [0021-merge-two-sorted-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0021-merge-two-sorted-lists) |
| [0023-merge-k-sorted-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0023-merge-k-sorted-lists) |
| [0061-rotate-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0061-rotate-list) |
| [0141-linked-list-cycle](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0142-linked-list-cycle-ii) |
| [0160-intersection-of-two-linked-lists](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0160-intersection-of-two-linked-lists) |
| [0203-remove-linked-list-elements](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0203-remove-linked-list-elements) |
| [0206-reverse-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0206-reverse-linked-list) |
| [0234-palindrome-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0234-palindrome-linked-list) |
| [0328-odd-even-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0328-odd-even-linked-list) |
| [0876-middle-of-the-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0876-middle-of-the-linked-list) |
| [1721-swapping-nodes-in-a-linked-list](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/1721-swapping-nodes-in-a-linked-list) |
## Design
|  |
| ------- |
| [0155-min-stack](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0155-min-stack) |
| [0225-implement-stack-using-queues](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0225-implement-stack-using-queues) |
| [0232-implement-queue-using-stacks](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0232-implement-queue-using-stacks) |
## Queue
|  |
| ------- |
| [0225-implement-stack-using-queues](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0225-implement-stack-using-queues) |
| [0232-implement-queue-using-stacks](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0232-implement-queue-using-stacks) |
| [0387-first-unique-character-in-a-string](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/0387-first-unique-character-in-a-string) |
| [2073-time-needed-to-buy-tickets](https://github.com/Atharvkadamcodes/LEETCODE/tree/master/2073-time-needed-to-buy-tickets) |
<!---LeetCode Topics End-->