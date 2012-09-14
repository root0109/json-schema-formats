package org.eel.kitchen.jsonschema.formats;

import org.eel.kitchen.jsonschema.format.FormatAttribute;

/**
 * Format specifier for {@code sha1}
 *
 * <p>This format will be quite familiar to git users!</p>
 *
 * @see HexStringFormatAttribute
 */
public final class SHA1FormatAttribute
    extends HexStringFormatAttribute
{
    private static final FormatAttribute instance = new SHA1FormatAttribute();

    private SHA1FormatAttribute()
    {
        super("SHA1 hash", 40);
    }

    public static FormatAttribute getInstance()
    {
        return instance;
    }

}