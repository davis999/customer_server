package io.reactivesw.common.util;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rai on 16/12/25.
 */
public final class LanguageTagUtils {
  /**
   * Instantiates a new Language tag utils.
   */
  private LanguageTagUtils() {
  }

  private static List<String> languages;

  static {
    if (languages == null || languages.isEmpty()) {
      Locale[] locales = DateFormat.getAvailableLocales();
      languages = Stream.of(locales).filter(
          locale -> StringUtils.isNotBlank(locale.getLanguage())
      ).map(
          locale -> {
            return locale.getLanguage();
          }
      ).collect(Collectors.toList());
    }
  }

  /**
   * Is legal language.
   *
   * @param languageTag the language tag
   * @return the boolean
   */
  public static boolean isLegalLanguage(String languageTag) {
    return languages.contains(languageTag);
  }
}
