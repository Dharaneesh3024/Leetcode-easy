char* mergeAlternately(const char* word1, const char* word2) {
    int len1 = strlen(word1);
    int len2 = strlen(word2);
    int maxLen = len1 > len2 ? len1 : len2;
    char* result = (char*)malloc((len1 + len2 + 1) * sizeof(char));
    int j = 0;

    for (int i = 0; i < maxLen; i++) {
        if (i < len1) {
            result[j++] = word1[i];
        }
        if (i < len2) {
            result[j++] = word2[i];
        }
    }
    
    result[j] = '\0'; // Null-terminate the result string
    return result;
}
     // Don't forget to free the allocated memory

