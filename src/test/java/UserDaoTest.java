import com.gymx.user.dao.IUserDao;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/2.
 */
public class UserDaoTest extends AbstractIT {

    @Resource
    private IUserDao userDao;

    @Test
    public void test(){
        userDao.findUsers();
    }

}
