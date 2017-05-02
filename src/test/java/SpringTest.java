import com.gymx.user.service.IUserService;
import org.junit.Test;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/1.
 */

public class SpringTest extends AbstractIT{

    @Resource
    private IUserService userService;

    @Test
    public void test(){
        userService.test();
    }
}
