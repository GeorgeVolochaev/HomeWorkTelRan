public class StringComparison {
    final long COUNT = 512_000;
    public enum MethodName {String,StringBuilder,StringBuffer}

    public void doString(MethodName mMethodName) {
        long startTime = System.currentTimeMillis();

        if (mMethodName == MethodName.String) {
            String str = "";
            for (int i = 0; i < COUNT; i++) {
                str += 'x';
            }
        }

        if (mMethodName == MethodName.StringBuilder) {
            var StringBuilder = new StringBuilder();
            for (int i = 0; i < COUNT; i++) {
                StringBuilder.append('x');
            }
        }

        if (mMethodName == MethodName.StringBuffer) {
                var StringBuffer = new StringBuffer();
                for (int i = 0; i < COUNT; i++) {
                    StringBuffer.append('x');
                }
        }
        System.out.println(mMethodName.name() + " " + (System.currentTimeMillis() - startTime));
        }
    }
