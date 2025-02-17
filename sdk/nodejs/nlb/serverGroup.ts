// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a NLB Server Group resource.
 *
 * For information about NLB Server Group and how to use it, see [What is Server Group](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createservergroup-nlb).
 *
 * > **NOTE:** Available since v1.186.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const defaultResourceGroups = alicloud.resourcemanager.getResourceGroups({});
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * });
 * const defaultServerGroup = new alicloud.nlb.ServerGroup("defaultServerGroup", {
 *     resourceGroupId: defaultResourceGroups.then(defaultResourceGroups => defaultResourceGroups.ids?.[0]),
 *     serverGroupName: name,
 *     serverGroupType: "Instance",
 *     vpcId: defaultNetwork.id,
 *     scheduler: "Wrr",
 *     protocol: "TCP",
 *     connectionDrain: true,
 *     connectionDrainTimeout: 60,
 *     addressIpVersion: "Ipv4",
 *     healthCheck: {
 *         healthCheckEnabled: true,
 *         healthCheckType: "TCP",
 *         healthCheckConnectPort: 0,
 *         healthyThreshold: 2,
 *         unhealthyThreshold: 2,
 *         healthCheckConnectTimeout: 5,
 *         healthCheckInterval: 10,
 *         httpCheckMethod: "GET",
 *         healthCheckHttpCodes: [
 *             "http_2xx",
 *             "http_3xx",
 *             "http_4xx",
 *         ],
 *     },
 *     tags: {
 *         Created: "TF",
 *         For: "example",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * NLB Server Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:nlb/serverGroup:ServerGroup example <id>
 * ```
 */
export class ServerGroup extends pulumi.CustomResource {
    /**
     * Get an existing ServerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerGroupState, opts?: pulumi.CustomResourceOptions): ServerGroup {
        return new ServerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:nlb/serverGroup:ServerGroup';

    /**
     * Returns true if the given object is an instance of ServerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerGroup.__pulumiType;
    }

    /**
     * Protocol version. Value:
     * - **ipv4**:IPv4 type.
     * - **DualStack**: Double Stack type.
     */
    public readonly addressIpVersion!: pulumi.Output<string>;
    /**
     * Full port forwarding.
     */
    public readonly anyPortEnabled!: pulumi.Output<boolean>;
    /**
     * . Field 'connection_drain' has been deprecated from provider version 1.214.0. New field 'connection_drain_enabled' instead.
     *
     * @deprecated Field 'connection_drain' has been deprecated since provider version 1.214.0. New field 'connection_drain_enabled' instead.
     */
    public readonly connectionDrain!: pulumi.Output<boolean>;
    /**
     * Whether to open the connection gracefully interrupted. Value:
     * - **true**: on.
     * - **false**: closed.
     */
    public readonly connectionDrainEnabled!: pulumi.Output<boolean>;
    /**
     * Set the connection elegant interrupt timeout. Unit: seconds. Valid values: **10** ~ **900**.
     */
    public readonly connectionDrainTimeout!: pulumi.Output<number>;
    /**
     * Health check configuration information. See `healthCheck` below.
     */
    public readonly healthCheck!: pulumi.Output<outputs.nlb.ServerGroupHealthCheck>;
    /**
     * Whether to enable the client address retention function. Value:
     * - **true**: on.
     * - **false**: closed.
     * > **NOTE:**  special instructions: When **AddressIPVersion** is of the **ipv4** type, the default value is **true**. **Addrestipversion** can only be **false** when the value of **ipv6** is **ipv6**, and can be **true** when supported by the underlying layer * *.
     */
    public readonly preserveClientIpEnabled!: pulumi.Output<boolean>;
    /**
     * The backend Forwarding Protocol. Valid values: **TCP**, **UDP**, or **TCPSSL**.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * The ID of the resource group to which the server group belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * Scheduling algorithm. Value:
     * - **Wrr**: Weighted polling. The higher the weight of the backend server, the higher the probability of being polled.
     * - **Rr**: polls external requests are distributed to backend servers in sequence according to the access order. sch: Source IP hash: The same source address is scheduled to the same backend server.
     * - **Tch**: Quadruple hash, based on the consistent hash of the Quad (source IP, Destination IP, source port, and destination port), the same stream is scheduled to the same backend server.
     * - **Qch**: a QUIC ID hash that allows you to hash requests with the same QUIC ID to the same backend server.
     */
    public readonly scheduler!: pulumi.Output<string>;
    /**
     * The name of the server group.
     */
    public readonly serverGroupName!: pulumi.Output<string>;
    /**
     * Server group type. Value:
     * - **Instance**: The server type. You can add **Ecs**, **Ens**, and **Eci** instances to the server group.
     * - **Ip**: Ip address type. You can add Ip addresses to a server group of this type.
     */
    public readonly serverGroupType!: pulumi.Output<string>;
    /**
     * Server group status. Value:
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Label.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The ID of the VPC to which the server group belongs.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a ServerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerGroupArgs | ServerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerGroupState | undefined;
            resourceInputs["addressIpVersion"] = state ? state.addressIpVersion : undefined;
            resourceInputs["anyPortEnabled"] = state ? state.anyPortEnabled : undefined;
            resourceInputs["connectionDrain"] = state ? state.connectionDrain : undefined;
            resourceInputs["connectionDrainEnabled"] = state ? state.connectionDrainEnabled : undefined;
            resourceInputs["connectionDrainTimeout"] = state ? state.connectionDrainTimeout : undefined;
            resourceInputs["healthCheck"] = state ? state.healthCheck : undefined;
            resourceInputs["preserveClientIpEnabled"] = state ? state.preserveClientIpEnabled : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["scheduler"] = state ? state.scheduler : undefined;
            resourceInputs["serverGroupName"] = state ? state.serverGroupName : undefined;
            resourceInputs["serverGroupType"] = state ? state.serverGroupType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ServerGroupArgs | undefined;
            if ((!args || args.serverGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverGroupName'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["addressIpVersion"] = args ? args.addressIpVersion : undefined;
            resourceInputs["anyPortEnabled"] = args ? args.anyPortEnabled : undefined;
            resourceInputs["connectionDrain"] = args ? args.connectionDrain : undefined;
            resourceInputs["connectionDrainEnabled"] = args ? args.connectionDrainEnabled : undefined;
            resourceInputs["connectionDrainTimeout"] = args ? args.connectionDrainTimeout : undefined;
            resourceInputs["healthCheck"] = args ? args.healthCheck : undefined;
            resourceInputs["preserveClientIpEnabled"] = args ? args.preserveClientIpEnabled : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["scheduler"] = args ? args.scheduler : undefined;
            resourceInputs["serverGroupName"] = args ? args.serverGroupName : undefined;
            resourceInputs["serverGroupType"] = args ? args.serverGroupType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerGroup resources.
 */
export interface ServerGroupState {
    /**
     * Protocol version. Value:
     * - **ipv4**:IPv4 type.
     * - **DualStack**: Double Stack type.
     */
    addressIpVersion?: pulumi.Input<string>;
    /**
     * Full port forwarding.
     */
    anyPortEnabled?: pulumi.Input<boolean>;
    /**
     * . Field 'connection_drain' has been deprecated from provider version 1.214.0. New field 'connection_drain_enabled' instead.
     *
     * @deprecated Field 'connection_drain' has been deprecated since provider version 1.214.0. New field 'connection_drain_enabled' instead.
     */
    connectionDrain?: pulumi.Input<boolean>;
    /**
     * Whether to open the connection gracefully interrupted. Value:
     * - **true**: on.
     * - **false**: closed.
     */
    connectionDrainEnabled?: pulumi.Input<boolean>;
    /**
     * Set the connection elegant interrupt timeout. Unit: seconds. Valid values: **10** ~ **900**.
     */
    connectionDrainTimeout?: pulumi.Input<number>;
    /**
     * Health check configuration information. See `healthCheck` below.
     */
    healthCheck?: pulumi.Input<inputs.nlb.ServerGroupHealthCheck>;
    /**
     * Whether to enable the client address retention function. Value:
     * - **true**: on.
     * - **false**: closed.
     * > **NOTE:**  special instructions: When **AddressIPVersion** is of the **ipv4** type, the default value is **true**. **Addrestipversion** can only be **false** when the value of **ipv6** is **ipv6**, and can be **true** when supported by the underlying layer * *.
     */
    preserveClientIpEnabled?: pulumi.Input<boolean>;
    /**
     * The backend Forwarding Protocol. Valid values: **TCP**, **UDP**, or **TCPSSL**.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the server group belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Scheduling algorithm. Value:
     * - **Wrr**: Weighted polling. The higher the weight of the backend server, the higher the probability of being polled.
     * - **Rr**: polls external requests are distributed to backend servers in sequence according to the access order. sch: Source IP hash: The same source address is scheduled to the same backend server.
     * - **Tch**: Quadruple hash, based on the consistent hash of the Quad (source IP, Destination IP, source port, and destination port), the same stream is scheduled to the same backend server.
     * - **Qch**: a QUIC ID hash that allows you to hash requests with the same QUIC ID to the same backend server.
     */
    scheduler?: pulumi.Input<string>;
    /**
     * The name of the server group.
     */
    serverGroupName?: pulumi.Input<string>;
    /**
     * Server group type. Value:
     * - **Instance**: The server type. You can add **Ecs**, **Ens**, and **Eci** instances to the server group.
     * - **Ip**: Ip address type. You can add Ip addresses to a server group of this type.
     */
    serverGroupType?: pulumi.Input<string>;
    /**
     * Server group status. Value:
     */
    status?: pulumi.Input<string>;
    /**
     * Label.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC to which the server group belongs.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerGroup resource.
 */
export interface ServerGroupArgs {
    /**
     * Protocol version. Value:
     * - **ipv4**:IPv4 type.
     * - **DualStack**: Double Stack type.
     */
    addressIpVersion?: pulumi.Input<string>;
    /**
     * Full port forwarding.
     */
    anyPortEnabled?: pulumi.Input<boolean>;
    /**
     * . Field 'connection_drain' has been deprecated from provider version 1.214.0. New field 'connection_drain_enabled' instead.
     *
     * @deprecated Field 'connection_drain' has been deprecated since provider version 1.214.0. New field 'connection_drain_enabled' instead.
     */
    connectionDrain?: pulumi.Input<boolean>;
    /**
     * Whether to open the connection gracefully interrupted. Value:
     * - **true**: on.
     * - **false**: closed.
     */
    connectionDrainEnabled?: pulumi.Input<boolean>;
    /**
     * Set the connection elegant interrupt timeout. Unit: seconds. Valid values: **10** ~ **900**.
     */
    connectionDrainTimeout?: pulumi.Input<number>;
    /**
     * Health check configuration information. See `healthCheck` below.
     */
    healthCheck?: pulumi.Input<inputs.nlb.ServerGroupHealthCheck>;
    /**
     * Whether to enable the client address retention function. Value:
     * - **true**: on.
     * - **false**: closed.
     * > **NOTE:**  special instructions: When **AddressIPVersion** is of the **ipv4** type, the default value is **true**. **Addrestipversion** can only be **false** when the value of **ipv6** is **ipv6**, and can be **true** when supported by the underlying layer * *.
     */
    preserveClientIpEnabled?: pulumi.Input<boolean>;
    /**
     * The backend Forwarding Protocol. Valid values: **TCP**, **UDP**, or **TCPSSL**.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the server group belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Scheduling algorithm. Value:
     * - **Wrr**: Weighted polling. The higher the weight of the backend server, the higher the probability of being polled.
     * - **Rr**: polls external requests are distributed to backend servers in sequence according to the access order. sch: Source IP hash: The same source address is scheduled to the same backend server.
     * - **Tch**: Quadruple hash, based on the consistent hash of the Quad (source IP, Destination IP, source port, and destination port), the same stream is scheduled to the same backend server.
     * - **Qch**: a QUIC ID hash that allows you to hash requests with the same QUIC ID to the same backend server.
     */
    scheduler?: pulumi.Input<string>;
    /**
     * The name of the server group.
     */
    serverGroupName: pulumi.Input<string>;
    /**
     * Server group type. Value:
     * - **Instance**: The server type. You can add **Ecs**, **Ens**, and **Eci** instances to the server group.
     * - **Ip**: Ip address type. You can add Ip addresses to a server group of this type.
     */
    serverGroupType?: pulumi.Input<string>;
    /**
     * Label.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC to which the server group belongs.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    vpcId: pulumi.Input<string>;
}
