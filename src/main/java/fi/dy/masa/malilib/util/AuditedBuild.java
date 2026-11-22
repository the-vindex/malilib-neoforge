package fi.dy.masa.malilib.util;

/**
 * Audited fork (Overseer, local-minecraft-mods-forks/malilib): identifies this build at runtime, so the printer can
 * refuse a stock MaFgLib with the same version string. Not a compile-time constant: read through {@link #marker()}.
 */
public final class AuditedBuild
{
    public static final String MARKER = String.valueOf("overseer-audited-mafglib-1");

    private AuditedBuild() {}

    public static String marker()
    {
        return MARKER;
    }
}
