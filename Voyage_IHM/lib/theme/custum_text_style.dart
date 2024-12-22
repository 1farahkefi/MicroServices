import 'package:flutter/material.dart';
import '../core/app_export.dart';
extension on TextStyle {
  TextStyle get andika {
    return copyWith(
      fontFamily: 'Andika',
    );
  }
  TextStyle get anton {
    return copyWith(
      fontFamily: 'Anton',
    );
  }
  TextStyle get openSans {
    return copyWith(
      fontFamily: 'Open Sans',
    );
  }
  TextStyle get roboto {
    return copyWith(
      fontFamily: 'Roboto',
    );
  }
  TextStyle get inter {
    return copyWith(
      fontFamily: 'Inter',
    );
  }
  TextStyle get montserrat {
    return copyWith(
      fontFamily: 'Montserrat',
    );
  }
  TextStyle get mukta {
    return copyWith(
      fontFamily: 'Mukta',
    );
  }
  TextStyle get poppins {
    return copyWith(
      fontFamily: 'Poppins',
    );
  }
}
/// A collection of pre-defined text styles for customizing text appearance,
/// categorized by different font families and weights.
/// Additionally, this class includes extensions on [TextStyle] to easily apply specific font families to text.
class CustomTextStyles {
// Body text style
  static TextStyle get bodyLargeBluegray900 =>
      theme.textTheme.bodyLarge!.copyWith(
        color: appTheme.blueGray900,
      );

  static TextStyle get bodyLargePoppins =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        fontSize: 16.fSize,
      );

  static TextStyle get bodyLargePoppins16 =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        fontSize: 16.fSize,
      );

  static TextStyle get bodyLargePoppinsGray500 =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        color: appTheme.gray500,
        fontSize: 16.fSize,
      );

  static TextStyle get bodyLargePoppinsGray50001 =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        color: appTheme.gray50001,
        fontSize: 16.fSize,
      );

  static TextStyle get bodyLargePoppinsGray90001 =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        color: appTheme.gray90001,
        fontSize: 16.fSize,
      );

  static TextStyle get bodyLargePoppinsIndigo400 =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        color: appTheme.indigo400,
        fontSize: 16.fSize,
      );

  static TextStyle get bodyLargePoppinsWhiteA70001 =>
      theme.textTheme.bodyLarge!.poppins.copyWith(
        color: appTheme.whiteA70001,
        fontSize: 16.fSize,
      );

  static TextStyle get bodyMedium13 =>
      theme.textTheme.bodyMedium!.copyWith(
        fontSize: 13.fSize,
      );

  static TextStyle get bodyMediumGray50001 =>
      theme.textTheme.bodyMedium!.copyWith(
        color: appTheme.gray50001,
      );

  static TextStyle get bodyMediumGray50002 =>
      theme.textTheme.bodyMedium!.copyWith(
        color: appTheme.gray50002,
      );

  static TextStyle get bodyMediumGray70001 =>
      theme.textTheme.bodyMedium!.copyWith(
        color: appTheme.gray70001,
      );

  static TextStyle get bodyMediumInterGray600 =>
      theme.textTheme.bodyMedium!.inter.copyWith(
        color: appTheme.gray600,
        fontSize: 15.fSize,
      );

  static TextStyle get bodyMediumInterOnPrimary =>
      theme.textTheme.bodyMedium!.inter.copyWith(
        color: theme.colorScheme.onPrimary,
        fontSize: 15.fSize,
      );

  static TextStyle get bodyMediumOpenSansPrimaryContainer =>
      theme.textTheme.bodyMedium!.openSans.copyWith(
        color: theme.colorScheme.primaryContainer,
      );

  static get bodyMedium_1 => theme.textTheme.bodyMedium!;

// Display text style
  static TextStyle get displaySmallPoppinsPrimary =>
      theme.textTheme.displaySmall!.poppins.copyWith(
        color: theme.colorScheme.primary,
        fontSize: 36.fSize,
      );

// Headline text style
  static TextStyle get headlineLargeAntonOrange500 =>
      theme.textTheme.headlineLarge!.anton.copyWith(
        color: appTheme.orange500,
        fontSize: 33.fSize,
        fontWeight: FontWeight.w400,
      );

  static TextStyle get headlineLargeIndigo400 =>
      theme.textTheme.headlineLarge!.copyWith(
        color: appTheme.indigo400,
        fontSize: 30.fSize,
        fontWeight: FontWeight.w600,
      );

  static TextStyle get headlineLargeLightblue900 =>
      theme.textTheme.headlineLarge!.copyWith(
        color: appTheme.lightBlue900,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get headlineSmallAndikaWhiteA70001 =>
      theme.textTheme.headlineSmall!.andika.copyWith(
        color: appTheme.whiteA70001,
        fontWeight: FontWeight.w400,
      );

// Label text style
  static TextStyle get labelLargeBlack900 =>
      textTheme.labelLarge!.copyWith(
        color: appTheme.black900,
      );

  static TextStyle get labelLargeOnError =>
      theme.textTheme.labelLarge!.copyWith(
        color: theme.colorScheme.onError,
      );

  static TextStyle get labelLargeWhiteA700 =>
      theme.textTheme.labelLarge!.copyWith(
        color: appTheme.whiteA700,
      );

// Title text style
  static TextStyle get titleLargeBlack900 =>
      theme.textTheme.titleLarge!.copyWith(
        color: appTheme.black900,
      );

  static TextStyle get titleLargeInter =>
      theme.textTheme.titleLarge!.inter.copyWith(
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleLargeMuktaOrange500 =>
      theme.textTheme.titleLarge!.mukta.copyWith(
        color: appTheme.orange500,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleLargePrimary =>
      theme.textTheme.titleLarge!.copyWith(
        color: theme.colorScheme.primary,
        fontWeight: FontWeight.w600,
      );

  static TextStyle get titleMediumBlack900 =>
      theme.textTheme.titleMedium!.copyWith(
        color: appTheme.black900,
        fontWeight: FontWeight.w600,
      );

  static TextStyle get titleMediumBlack900_1 =>
      theme.textTheme.titleMedium!.copyWith(
        color: appTheme.black900,
      );

  static TextStyle get titleMediumGray50003 =>
      theme.textTheme.titleMedium!.copyWith(
        color: appTheme.gray50003,
        fontWeight: FontWeight.w600,
      );

  static TextStyle get titleMediumGray50003SemiBold =>
      theme.textTheme.titleMedium!.copyWith(
        color: appTheme.gray50003,
        fontSize: 17.fSize,
        fontWeight: FontWeight.w600,
      );

  static TextStyle get titleMediumGray50003SemiBold18 =>
      textTheme.titleMedium!.copyWith(
        color: appTheme.gray50003,
        fontSize: 18.fSize,
        fontWeight:FontWeight.w600,);



  static TextStyle get titleMediumMontserrat =>
      theme.textTheme.titleMedium!.montserrat.copyWith(
        fontSize: 19.fSize,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleMediumPrimaryContainer =>
      theme.textTheme.titleMedium!.copyWith(
        color: theme.colorScheme.primaryContainer,
        fontSize: 17.fSize,
        fontWeight: FontWeight.w600,
      );

  static TextStyle get titleMediumRoboto =>
      theme.textTheme.titleMedium!.roboto.copyWith(
        fontSize: 18.fSize,
      );

  static TextStyle get titleMediumRobotoBluegray900 =>
      theme.textTheme.titleMedium!.roboto.copyWith(
        color: appTheme.blueGray900,
        fontSize: 17.fSize,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleMediumRobotoGray30001 =>
      theme.textTheme.titleMedium!.roboto.copyWith(
        color: appTheme.gray30001,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleMediumRobotoGray50005 =>
      theme.textTheme.titleMedium!.roboto.copyWith(
        color: appTheme.gray50005,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleSmallBluegray90001 =>
      theme.textTheme.titleSmall!.copyWith(
        color: appTheme.blueGray90001,
      );

  static TextStyle get titleSmallMontserratWhiteA70001 =>
      theme.textTheme.titleSmall!.montserrat.copyWith(
        color: appTheme.whiteA70001,
        fontSize: 15.fSize,
        fontWeight: FontWeight.w700,
      );

  static TextStyle get titleSmallRobotoGray60002 =>
      theme.textTheme.titleSmall!.roboto.copyWith(
        color: appTheme.gray60002,
      );

  static TextStyle get titleSmallRobotoGray800 =>
      theme.textTheme.titleSmall!.roboto.copyWith(
        color: appTheme.gray800,
        fontSize: 15.fSize,
      );
  );
  static TextStyle get titleSmallRobotoSecondaryContainer =>
      theme.textTheme.titleSmall!.roboto.copyWith(
        color: theme.colorScheme.secondaryContainer,
        fontWeight: FontWeight.w900,
      );
  static TextStyle get titleSmallWhiteA70001 =>
      theme.textTheme.titleSmall!.copyWith(
        color: appTheme.whiteA70001,
      );
  static get titleSmall_1 => theme.textTheme.titleSmall!;
}
