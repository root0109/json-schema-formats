package org.eel.kitchen.jsonschema.formats;

import org.eel.kitchen.jsonschema.format.FormatSpecifier;

/**
 * Format specifier for {@code sha1}
 *
 * <p>This format will be quite familiar to git users!</p>
 *
 * @see HexStringFormatSpecifier
 */
public final class SHA1FormatSpecifier
    extends HexStringFormatSpecifier
{
    private static final FormatSpecifier instance = new SHA1FormatSpecifier();

    private SHA1FormatSpecifier()
    {
        super("SHA1 hash", 40);
    }

    public static FormatSpecifier getInstance()
    {
        return instance;
    }

}