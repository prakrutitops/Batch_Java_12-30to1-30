import com.razorpay.RazorpayClient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String paymentId = request.getParameter("razorpay_payment_id");
            String orderId = request.getParameter("razorpay_order_id");
            String signature = request.getParameter("razorpay_signature");

            // Generate the expected signature
            String generatedSignature = generateSignature(orderId, paymentId);

            // Verify the payment signature
            if (generatedSignature.equals(signature)) {
                // Payment is verified
                response.getWriter().write("Payment successful");
                // Handle successful payment (e.g., update database)
            } else {
                response.getWriter().write("Payment verification failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Payment failed: " + e.getMessage());
        }
    }

    private String generateSignature(String orderId, String paymentId) throws NoSuchAlgorithmException {
        String key = "K0W1DGi9tShYb7T86ym2r1tT";
        String data = orderId + "|" + paymentId;

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update((key + "|" + data).getBytes());
        byte[] digest = md.digest();
        return Base64.getEncoder().encodeToString(digest);
    }
}
