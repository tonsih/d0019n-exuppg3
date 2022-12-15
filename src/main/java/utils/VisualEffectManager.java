package utils;

import game.data.K;

public class VisualEffectManager implements K
{
    private boolean clearConsoleEnabled;

    public VisualEffectManager()
    {
        this.clearConsoleEnabled = false;
    }

    public void setClearConsole(boolean isEnabled)
    {
        this.clearConsoleEnabled = isEnabled;
    }

    public void clearConsole() throws Exception
    {
        if (clearConsoleEnabled)
        {
            try
            {
                if (System.getProperty("os.name").contains("Windows"))
                {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start()
                            .waitFor();
                } else
                {
//                    System.out.print("\033\143");
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                }
            } catch (Exception e)
            {
                throw new Exception(e);
            }
        }
    }

    public boolean isClearConsoleEnabled()
    {
        return this.clearConsoleEnabled;
    }
}