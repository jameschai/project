import com.gymx.user.dao.IUserDao;
import com.gymx.user.model.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/2.
 */
public class UserDaoTest extends AbstractIT {

    @Resource
    private IUserDao userDao;

    @Test
    public void QueryTest(){
//        userDao.findAllUsers();
        userDao.findUserByName("sysadmin");
    }

    @Test
    public void saveTest(){
        User user = new User();
        user.setName("james");
        user.setPassword("1234");
        User u = userDao.save(user);
        logger.info("ID:" + u.getId());
    }

    @Test
    public void updateTest(){
        User user = userDao.findUserByName("admin");
        user.setPassword("1234567");
        userDao.update(user);
    }

    @Test
    public void deleteTest(){
        User user = userDao.findUserByName("james");
        userDao.delete(user.getId());
    }

}
