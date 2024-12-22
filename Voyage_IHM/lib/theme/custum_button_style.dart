import 'package:flutter/material.dart';
import '../core/app_export.dart';
/// A class that offers pre-defined button styles for customizing button appearance.
class CustomButtonStyles {
  // Filled button style
  static ButtonStyle get fillGray => ElevatedButton.styleFrom(
    backgroundColor: appTheme.gray90002,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(18.h),
    ),
    elevation: 0,
    padding: EdgeInsets.zero,
  );
  static ButtonStyle get fillIndigo => ElevatedButton.styleFrom(
    backgroundColor: appTheme.indigo600,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(18.h),
    ),
    elevation: 0,
    padding: EdgeInsets.zero,
  );
  static ButtonStyle get fillPrimaryTL14 => ElevatedButton.styleFrom(
    backgroundColor: theme.colorScheme.primary,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(14.h),
    ),
    elevation: 0,
    padding: EdgeInsets.zero,
  );
  static ButtonStyle get fillPrimaryTL22 => ElevatedButton.styleFrom(
    backgroundColor: theme.colorScheme.primary,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(22.h),
    ),
    elevation: 0,
    padding: EdgeInsets.zero,
  );
  static ButtonStyle get fillPrimaryTL26 => ElevatedButton.styleFrom(
    backgroundColor: theme.colorScheme.primary,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(26.h),
    ),
    elevation: 0,
    padding: EdgeInsets.zero,
  );
  static ButtonStyle get fillPrimaryTL30 => ElevatedButton.styleFrom(
    backgroundColor: theme.colorScheme.primary,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(30.h),
    ),
    elevation: 0,
    padding: EdgeInsets.zero,
  );
  // Outline button style
  static ButtonStyle get outlineBlack => ElevatedButton.styleFrom(
    backgroundColor: theme.colorScheme.primary,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(22.h),
    ),
    shadowColor: appTheme.black900.withOpacity(0.25),
    elevation: 4,
    padding: EdgeInsets.zero,
  );
// text button style
  static ButtonStyle get none => ButtonStyle(
      backgroundColor: WidgetStateProperty.all<Color>(Colors.transparent),
      elevation: WidgetStateProperty.all<double>(0),
      padding: WidgetStateProperty.all<EdgeInsetsGeometry>(EdgeInsets.zero),
      side: WidgetStateProperty.all<BorderSide>(
        BorderSide(color: Colors.transparent),
      ));

}