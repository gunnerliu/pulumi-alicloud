// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A forwarding rule is configured in `HTTP`/`HTTPS` listener and it used to listen a list of backend servers which in one specified virtual backend server group.
 * You can add forwarding rules to a listener to forward requests based on the domain names or the URL in the request.
 *
 * > **NOTE:** One virtual backend server group can be attached in multiple forwarding rules.
 *
 * > **NOTE:** At least one "Domain" or "Url" must be specified when creating a new rule.
 *
 * > **NOTE:** Having the same 'Domain' and 'Url' rule can not be created repeatedly in the one listener.
 *
 * > **NOTE:** Rule only be created in the `HTTP` or `HTTPS` listener.
 *
 * > **NOTE:** Only rule's virtual server group can be modified.
 *
 * ## Import
 *
 * Load balancer forwarding rule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:slb/rule:Rule example rule-abc123456
 * ```
 */
export class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuleState, opts?: pulumi.CustomResourceOptions): Rule {
        return new Rule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:slb/rule:Rule';

    /**
     * Returns true if the given object is an instance of Rule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rule.__pulumiType;
    }

    /**
     * The cookie configured on the server. It is mandatory when `stickySession` is "on" and `stickySessionType` is "server". Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     */
    public readonly cookie!: pulumi.Output<string | undefined>;
    /**
     * Cookie timeout. It is mandatory when `stickySession` is "on" and `stickySessionType` is "insert". Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     */
    public readonly cookieTimeout!: pulumi.Output<number | undefined>;
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    public readonly deleteProtectionValidation!: pulumi.Output<boolean | undefined>;
    /**
     * Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
     * and wildcard characters. The following two domain name formats are supported:
     * - Standard domain name: www.test.com
     * - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
     */
    public readonly domain!: pulumi.Output<string | undefined>;
    /**
     * The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
     */
    public readonly frontendPort!: pulumi.Output<number>;
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener's HealthCheck is always on, so it will be ignore when launching TCP or UDP listener. This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    public readonly healthCheck!: pulumi.Output<string | undefined>;
    /**
     * Port used for health check. Valid value range: [1-65535]. Default to "None" means the backend server port is used.
     */
    public readonly healthCheckConnectPort!: pulumi.Output<number>;
    /**
     * Domain name used for health check. When it used to launch TCP listener, `healthCheckType` must be "http". Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     */
    public readonly healthCheckDomain!: pulumi.Output<string | undefined>;
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `healthCheck` is on. Default to `http2xx`.  Valid values are: `http2xx`,  `http3xx`, `http4xx` and `http5xx`.
     */
    public readonly healthCheckHttpCode!: pulumi.Output<string | undefined>;
    /**
     * Time interval of health checks. It is required when `healthCheck` is on. Valid value range: [1-50] in seconds. Default to 2.
     */
    public readonly healthCheckInterval!: pulumi.Output<number | undefined>;
    /**
     * Maximum timeout of each health check response. It is required when `healthCheck` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `healthCheckTimeout` < `healthCheckInterval`, its will be replaced by `healthCheckInterval`.
     */
    public readonly healthCheckTimeout!: pulumi.Output<number | undefined>;
    /**
     * URI used for health check. When it used to launch TCP listener, `healthCheckType` must be "http". Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&’ are allowed.
     */
    public readonly healthCheckUri!: pulumi.Output<string | undefined>;
    /**
     * Threshold determining the result of the health check is success. It is required when `healthCheck` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    public readonly healthyThreshold!: pulumi.Output<number | undefined>;
    /**
     * Indicates whether a forwarding rule inherits the settings of a health check , session persistence, and scheduling algorithm from a listener. Default to on.
     */
    public readonly listenerSync!: pulumi.Output<string | undefined>;
    /**
     * The Load Balancer ID which is used to launch the new forwarding rule.
     */
    public readonly loadBalancerId!: pulumi.Output<string>;
    /**
     * Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Scheduling algorithm, Valid values are `wrr`, `rr` and `wlc`.  Default to "wrr". This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    public readonly scheduler!: pulumi.Output<string | undefined>;
    /**
     * ID of a virtual server group that will be forwarded.
     */
    public readonly serverGroupId!: pulumi.Output<string>;
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`. This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    public readonly stickySession!: pulumi.Output<string | undefined>;
    /**
     * Mode for handling the cookie. If `stickySession` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     */
    public readonly stickySessionType!: pulumi.Output<string | undefined>;
    /**
     * Threshold determining the result of the health check is fail. It is required when `healthCheck` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    public readonly unhealthyThreshold!: pulumi.Output<number | undefined>;
    /**
     * Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
     * and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
     */
    public readonly url!: pulumi.Output<string | undefined>;

    /**
     * Create a Rule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuleArgs | RuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RuleState | undefined;
            resourceInputs["cookie"] = state ? state.cookie : undefined;
            resourceInputs["cookieTimeout"] = state ? state.cookieTimeout : undefined;
            resourceInputs["deleteProtectionValidation"] = state ? state.deleteProtectionValidation : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["frontendPort"] = state ? state.frontendPort : undefined;
            resourceInputs["healthCheck"] = state ? state.healthCheck : undefined;
            resourceInputs["healthCheckConnectPort"] = state ? state.healthCheckConnectPort : undefined;
            resourceInputs["healthCheckDomain"] = state ? state.healthCheckDomain : undefined;
            resourceInputs["healthCheckHttpCode"] = state ? state.healthCheckHttpCode : undefined;
            resourceInputs["healthCheckInterval"] = state ? state.healthCheckInterval : undefined;
            resourceInputs["healthCheckTimeout"] = state ? state.healthCheckTimeout : undefined;
            resourceInputs["healthCheckUri"] = state ? state.healthCheckUri : undefined;
            resourceInputs["healthyThreshold"] = state ? state.healthyThreshold : undefined;
            resourceInputs["listenerSync"] = state ? state.listenerSync : undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scheduler"] = state ? state.scheduler : undefined;
            resourceInputs["serverGroupId"] = state ? state.serverGroupId : undefined;
            resourceInputs["stickySession"] = state ? state.stickySession : undefined;
            resourceInputs["stickySessionType"] = state ? state.stickySessionType : undefined;
            resourceInputs["unhealthyThreshold"] = state ? state.unhealthyThreshold : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if ((!args || args.frontendPort === undefined) && !opts.urn) {
                throw new Error("Missing required property 'frontendPort'");
            }
            if ((!args || args.loadBalancerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            if ((!args || args.serverGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverGroupId'");
            }
            resourceInputs["cookie"] = args ? args.cookie : undefined;
            resourceInputs["cookieTimeout"] = args ? args.cookieTimeout : undefined;
            resourceInputs["deleteProtectionValidation"] = args ? args.deleteProtectionValidation : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["frontendPort"] = args ? args.frontendPort : undefined;
            resourceInputs["healthCheck"] = args ? args.healthCheck : undefined;
            resourceInputs["healthCheckConnectPort"] = args ? args.healthCheckConnectPort : undefined;
            resourceInputs["healthCheckDomain"] = args ? args.healthCheckDomain : undefined;
            resourceInputs["healthCheckHttpCode"] = args ? args.healthCheckHttpCode : undefined;
            resourceInputs["healthCheckInterval"] = args ? args.healthCheckInterval : undefined;
            resourceInputs["healthCheckTimeout"] = args ? args.healthCheckTimeout : undefined;
            resourceInputs["healthCheckUri"] = args ? args.healthCheckUri : undefined;
            resourceInputs["healthyThreshold"] = args ? args.healthyThreshold : undefined;
            resourceInputs["listenerSync"] = args ? args.listenerSync : undefined;
            resourceInputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scheduler"] = args ? args.scheduler : undefined;
            resourceInputs["serverGroupId"] = args ? args.serverGroupId : undefined;
            resourceInputs["stickySession"] = args ? args.stickySession : undefined;
            resourceInputs["stickySessionType"] = args ? args.stickySessionType : undefined;
            resourceInputs["unhealthyThreshold"] = args ? args.unhealthyThreshold : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rule resources.
 */
export interface RuleState {
    /**
     * The cookie configured on the server. It is mandatory when `stickySession` is "on" and `stickySessionType` is "server". Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     */
    cookie?: pulumi.Input<string>;
    /**
     * Cookie timeout. It is mandatory when `stickySession` is "on" and `stickySessionType` is "insert". Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     */
    cookieTimeout?: pulumi.Input<number>;
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    deleteProtectionValidation?: pulumi.Input<boolean>;
    /**
     * Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
     * and wildcard characters. The following two domain name formats are supported:
     * - Standard domain name: www.test.com
     * - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
     */
    domain?: pulumi.Input<string>;
    /**
     * The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
     */
    frontendPort?: pulumi.Input<number>;
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener's HealthCheck is always on, so it will be ignore when launching TCP or UDP listener. This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    healthCheck?: pulumi.Input<string>;
    /**
     * Port used for health check. Valid value range: [1-65535]. Default to "None" means the backend server port is used.
     */
    healthCheckConnectPort?: pulumi.Input<number>;
    /**
     * Domain name used for health check. When it used to launch TCP listener, `healthCheckType` must be "http". Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     */
    healthCheckDomain?: pulumi.Input<string>;
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `healthCheck` is on. Default to `http2xx`.  Valid values are: `http2xx`,  `http3xx`, `http4xx` and `http5xx`.
     */
    healthCheckHttpCode?: pulumi.Input<string>;
    /**
     * Time interval of health checks. It is required when `healthCheck` is on. Valid value range: [1-50] in seconds. Default to 2.
     */
    healthCheckInterval?: pulumi.Input<number>;
    /**
     * Maximum timeout of each health check response. It is required when `healthCheck` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `healthCheckTimeout` < `healthCheckInterval`, its will be replaced by `healthCheckInterval`.
     */
    healthCheckTimeout?: pulumi.Input<number>;
    /**
     * URI used for health check. When it used to launch TCP listener, `healthCheckType` must be "http". Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&’ are allowed.
     */
    healthCheckUri?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is success. It is required when `healthCheck` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    healthyThreshold?: pulumi.Input<number>;
    /**
     * Indicates whether a forwarding rule inherits the settings of a health check , session persistence, and scheduling algorithm from a listener. Default to on.
     */
    listenerSync?: pulumi.Input<string>;
    /**
     * The Load Balancer ID which is used to launch the new forwarding rule.
     */
    loadBalancerId?: pulumi.Input<string>;
    /**
     * Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
     */
    name?: pulumi.Input<string>;
    /**
     * Scheduling algorithm, Valid values are `wrr`, `rr` and `wlc`.  Default to "wrr". This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    scheduler?: pulumi.Input<string>;
    /**
     * ID of a virtual server group that will be forwarded.
     */
    serverGroupId?: pulumi.Input<string>;
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`. This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    stickySession?: pulumi.Input<string>;
    /**
     * Mode for handling the cookie. If `stickySession` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     */
    stickySessionType?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is fail. It is required when `healthCheck` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    unhealthyThreshold?: pulumi.Input<number>;
    /**
     * Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
     * and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * The cookie configured on the server. It is mandatory when `stickySession` is "on" and `stickySessionType` is "server". Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     */
    cookie?: pulumi.Input<string>;
    /**
     * Cookie timeout. It is mandatory when `stickySession` is "on" and `stickySessionType` is "insert". Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     */
    cookieTimeout?: pulumi.Input<number>;
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    deleteProtectionValidation?: pulumi.Input<boolean>;
    /**
     * Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
     * and wildcard characters. The following two domain name formats are supported:
     * - Standard domain name: www.test.com
     * - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
     */
    domain?: pulumi.Input<string>;
    /**
     * The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
     */
    frontendPort: pulumi.Input<number>;
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener's HealthCheck is always on, so it will be ignore when launching TCP or UDP listener. This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    healthCheck?: pulumi.Input<string>;
    /**
     * Port used for health check. Valid value range: [1-65535]. Default to "None" means the backend server port is used.
     */
    healthCheckConnectPort?: pulumi.Input<number>;
    /**
     * Domain name used for health check. When it used to launch TCP listener, `healthCheckType` must be "http". Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     */
    healthCheckDomain?: pulumi.Input<string>;
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `healthCheck` is on. Default to `http2xx`.  Valid values are: `http2xx`,  `http3xx`, `http4xx` and `http5xx`.
     */
    healthCheckHttpCode?: pulumi.Input<string>;
    /**
     * Time interval of health checks. It is required when `healthCheck` is on. Valid value range: [1-50] in seconds. Default to 2.
     */
    healthCheckInterval?: pulumi.Input<number>;
    /**
     * Maximum timeout of each health check response. It is required when `healthCheck` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `healthCheckTimeout` < `healthCheckInterval`, its will be replaced by `healthCheckInterval`.
     */
    healthCheckTimeout?: pulumi.Input<number>;
    /**
     * URI used for health check. When it used to launch TCP listener, `healthCheckType` must be "http". Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&’ are allowed.
     */
    healthCheckUri?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is success. It is required when `healthCheck` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    healthyThreshold?: pulumi.Input<number>;
    /**
     * Indicates whether a forwarding rule inherits the settings of a health check , session persistence, and scheduling algorithm from a listener. Default to on.
     */
    listenerSync?: pulumi.Input<string>;
    /**
     * The Load Balancer ID which is used to launch the new forwarding rule.
     */
    loadBalancerId: pulumi.Input<string>;
    /**
     * Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
     */
    name?: pulumi.Input<string>;
    /**
     * Scheduling algorithm, Valid values are `wrr`, `rr` and `wlc`.  Default to "wrr". This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    scheduler?: pulumi.Input<string>;
    /**
     * ID of a virtual server group that will be forwarded.
     */
    serverGroupId: pulumi.Input<string>;
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`. This parameter is required  and takes effect only when ListenerSync is set to off.
     */
    stickySession?: pulumi.Input<string>;
    /**
     * Mode for handling the cookie. If `stickySession` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     */
    stickySessionType?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is fail. It is required when `healthCheck` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    unhealthyThreshold?: pulumi.Input<number>;
    /**
     * Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
     * and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
     */
    url?: pulumi.Input<string>;
}
