// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.inputs.GetConnectionsArgs;
import com.pulumi.alicloud.vpn.inputs.GetConnectionsPlainArgs;
import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysPlainArgs;
import com.pulumi.alicloud.vpn.inputs.GetGatewaysArgs;
import com.pulumi.alicloud.vpn.inputs.GetGatewaysPlainArgs;
import com.pulumi.alicloud.vpn.outputs.GetConnectionsResult;
import com.pulumi.alicloud.vpn.outputs.GetCustomerGatewaysResult;
import com.pulumi.alicloud.vpn.outputs.GetGatewaysResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class VpnFunctions {
    /**
     * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.kvstore.inputs.GetConnectionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getConnections(GetConnectionsArgs.builder()
     *             .customerGatewayId(&#34;fake-cgw-id&#34;)
     *             .ids(&#34;fake-conn-id&#34;)
     *             .outputFile(&#34;/tmp/vpnconn&#34;)
     *             .vpnGatewayId(&#34;fake-vpn-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetConnectionsResult> getConnections() {
        return getConnections(GetConnectionsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.kvstore.inputs.GetConnectionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getConnections(GetConnectionsArgs.builder()
     *             .customerGatewayId(&#34;fake-cgw-id&#34;)
     *             .ids(&#34;fake-conn-id&#34;)
     *             .outputFile(&#34;/tmp/vpnconn&#34;)
     *             .vpnGatewayId(&#34;fake-vpn-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetConnectionsResult> getConnectionsPlain() {
        return getConnectionsPlain(GetConnectionsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.kvstore.inputs.GetConnectionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getConnections(GetConnectionsArgs.builder()
     *             .customerGatewayId(&#34;fake-cgw-id&#34;)
     *             .ids(&#34;fake-conn-id&#34;)
     *             .outputFile(&#34;/tmp/vpnconn&#34;)
     *             .vpnGatewayId(&#34;fake-vpn-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetConnectionsResult> getConnections(GetConnectionsArgs args) {
        return getConnections(args, InvokeOptions.Empty);
    }
    /**
     * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.kvstore.inputs.GetConnectionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getConnections(GetConnectionsArgs.builder()
     *             .customerGatewayId(&#34;fake-cgw-id&#34;)
     *             .ids(&#34;fake-conn-id&#34;)
     *             .outputFile(&#34;/tmp/vpnconn&#34;)
     *             .vpnGatewayId(&#34;fake-vpn-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetConnectionsResult> getConnectionsPlain(GetConnectionsPlainArgs args) {
        return getConnectionsPlain(args, InvokeOptions.Empty);
    }
    /**
     * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.kvstore.inputs.GetConnectionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getConnections(GetConnectionsArgs.builder()
     *             .customerGatewayId(&#34;fake-cgw-id&#34;)
     *             .ids(&#34;fake-conn-id&#34;)
     *             .outputFile(&#34;/tmp/vpnconn&#34;)
     *             .vpnGatewayId(&#34;fake-vpn-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetConnectionsResult> getConnections(GetConnectionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:vpn/getConnections:getConnections", TypeShape.of(GetConnectionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.kvstore.inputs.GetConnectionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getConnections(GetConnectionsArgs.builder()
     *             .customerGatewayId(&#34;fake-cgw-id&#34;)
     *             .ids(&#34;fake-conn-id&#34;)
     *             .outputFile(&#34;/tmp/vpnconn&#34;)
     *             .vpnGatewayId(&#34;fake-vpn-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetConnectionsResult> getConnectionsPlain(GetConnectionsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:vpn/getConnections:getConnections", TypeShape.of(GetConnectionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getCustomerGateways(GetCustomerGatewaysArgs.builder()
     *             .ids(            
     *                 &#34;fake-id1&#34;,
     *                 &#34;fake-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/cgws&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCustomerGatewaysResult> getCustomerGateways() {
        return getCustomerGateways(GetCustomerGatewaysArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getCustomerGateways(GetCustomerGatewaysArgs.builder()
     *             .ids(            
     *                 &#34;fake-id1&#34;,
     *                 &#34;fake-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/cgws&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCustomerGatewaysResult> getCustomerGatewaysPlain() {
        return getCustomerGatewaysPlain(GetCustomerGatewaysPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getCustomerGateways(GetCustomerGatewaysArgs.builder()
     *             .ids(            
     *                 &#34;fake-id1&#34;,
     *                 &#34;fake-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/cgws&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCustomerGatewaysResult> getCustomerGateways(GetCustomerGatewaysArgs args) {
        return getCustomerGateways(args, InvokeOptions.Empty);
    }
    /**
     * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getCustomerGateways(GetCustomerGatewaysArgs.builder()
     *             .ids(            
     *                 &#34;fake-id1&#34;,
     *                 &#34;fake-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/cgws&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCustomerGatewaysResult> getCustomerGatewaysPlain(GetCustomerGatewaysPlainArgs args) {
        return getCustomerGatewaysPlain(args, InvokeOptions.Empty);
    }
    /**
     * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getCustomerGateways(GetCustomerGatewaysArgs.builder()
     *             .ids(            
     *                 &#34;fake-id1&#34;,
     *                 &#34;fake-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/cgws&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCustomerGatewaysResult> getCustomerGateways(GetCustomerGatewaysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:vpn/getCustomerGateways:getCustomerGateways", TypeShape.of(GetCustomerGatewaysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.vpn.inputs.GetCustomerGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var foo = VpnFunctions.getCustomerGateways(GetCustomerGatewaysArgs.builder()
     *             .ids(            
     *                 &#34;fake-id1&#34;,
     *                 &#34;fake-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/cgws&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCustomerGatewaysResult> getCustomerGatewaysPlain(GetCustomerGatewaysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:vpn/getCustomerGateways:getCustomerGateways", TypeShape.of(GetCustomerGatewaysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var vpnGateways = VpnFunctions.getGateways(GetGatewaysArgs.builder()
     *             .businessStatus(&#34;Normal&#34;)
     *             .enableIpsec(true)
     *             .ids(            
     *                 &#34;fake-vpn-id1&#34;,
     *                 &#34;fake-vpn-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/vpns&#34;)
     *             .status(&#34;active&#34;)
     *             .vpcId(&#34;fake-vpc-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetGatewaysResult> getGateways() {
        return getGateways(GetGatewaysArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var vpnGateways = VpnFunctions.getGateways(GetGatewaysArgs.builder()
     *             .businessStatus(&#34;Normal&#34;)
     *             .enableIpsec(true)
     *             .ids(            
     *                 &#34;fake-vpn-id1&#34;,
     *                 &#34;fake-vpn-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/vpns&#34;)
     *             .status(&#34;active&#34;)
     *             .vpcId(&#34;fake-vpc-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGatewaysResult> getGatewaysPlain() {
        return getGatewaysPlain(GetGatewaysPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var vpnGateways = VpnFunctions.getGateways(GetGatewaysArgs.builder()
     *             .businessStatus(&#34;Normal&#34;)
     *             .enableIpsec(true)
     *             .ids(            
     *                 &#34;fake-vpn-id1&#34;,
     *                 &#34;fake-vpn-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/vpns&#34;)
     *             .status(&#34;active&#34;)
     *             .vpcId(&#34;fake-vpc-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetGatewaysResult> getGateways(GetGatewaysArgs args) {
        return getGateways(args, InvokeOptions.Empty);
    }
    /**
     * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var vpnGateways = VpnFunctions.getGateways(GetGatewaysArgs.builder()
     *             .businessStatus(&#34;Normal&#34;)
     *             .enableIpsec(true)
     *             .ids(            
     *                 &#34;fake-vpn-id1&#34;,
     *                 &#34;fake-vpn-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/vpns&#34;)
     *             .status(&#34;active&#34;)
     *             .vpcId(&#34;fake-vpc-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGatewaysResult> getGatewaysPlain(GetGatewaysPlainArgs args) {
        return getGatewaysPlain(args, InvokeOptions.Empty);
    }
    /**
     * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var vpnGateways = VpnFunctions.getGateways(GetGatewaysArgs.builder()
     *             .businessStatus(&#34;Normal&#34;)
     *             .enableIpsec(true)
     *             .ids(            
     *                 &#34;fake-vpn-id1&#34;,
     *                 &#34;fake-vpn-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/vpns&#34;)
     *             .status(&#34;active&#34;)
     *             .vpcId(&#34;fake-vpc-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetGatewaysResult> getGateways(GetGatewaysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:vpn/getGateways:getGateways", TypeShape.of(GetGatewaysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.vpn.VpnFunctions;
     * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetGatewaysArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var vpnGateways = VpnFunctions.getGateways(GetGatewaysArgs.builder()
     *             .businessStatus(&#34;Normal&#34;)
     *             .enableIpsec(true)
     *             .ids(            
     *                 &#34;fake-vpn-id1&#34;,
     *                 &#34;fake-vpn-id2&#34;)
     *             .nameRegex(&#34;testAcc*&#34;)
     *             .outputFile(&#34;/tmp/vpns&#34;)
     *             .status(&#34;active&#34;)
     *             .vpcId(&#34;fake-vpc-id&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGatewaysResult> getGatewaysPlain(GetGatewaysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:vpn/getGateways:getGateways", TypeShape.of(GetGatewaysResult.class), args, Utilities.withVersion(options));
    }
}
