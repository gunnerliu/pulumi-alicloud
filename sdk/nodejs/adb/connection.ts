// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an ADB connection resource to allocate an Internet connection string for ADB cluster.
 *
 * > **NOTE:** Each ADB instance will allocate a intranet connnection string automatically and its prifix is ADB instance ID.
 *  To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
 *
 * > **NOTE:** Available in v1.81.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const creation = config.get("creation") || "ADB";
 * const name = config.get("name") || "adbaccountmysql";
 *
 * const defaultZones = pulumi.output(alicloud.getZones({
 *     availableResourceCreation: creation,
 * }, { async: true }));
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     availabilityZone: defaultZones.zones[0].id,
 *     cidrBlock: "172.16.0.0/24",
 *     vpcId: defaultNetwork.id,
 * });
 * const cluster = new alicloud.adb.Cluster("cluster", {
 *     dbClusterCategory: "Cluster",
 *     dbClusterVersion: "3.0",
 *     dbNodeClass: "C8",
 *     dbNodeCount: 2,
 *     dbNodeStorage: 200,
 *     description: name,
 *     payType: "PostPaid",
 *     vswitchId: defaultSwitch.id,
 * });
 * const connection = new alicloud.adb.Connection("connection", {
 *     connectionPrefix: "testabc",
 *     dbClusterId: cluster.id,
 * });
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:adb/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <db_cluster_id> + 'tf'.
     */
    public readonly connectionPrefix!: pulumi.Output<string>;
    /**
     * Connection cluster string.
     */
    public /*out*/ readonly connectionString!: pulumi.Output<string>;
    /**
     * The Id of cluster that can run database.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * The ip address of connection string.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * Connection cluster port.
     */
    public /*out*/ readonly port!: pulumi.Output<string>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            inputs["connectionPrefix"] = state ? state.connectionPrefix : undefined;
            inputs["connectionString"] = state ? state.connectionString : undefined;
            inputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            inputs["ipAddress"] = state ? state.ipAddress : undefined;
            inputs["port"] = state ? state.port : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if (!args || args.dbClusterId === undefined) {
                throw new Error("Missing required property 'dbClusterId'");
            }
            inputs["connectionPrefix"] = args ? args.connectionPrefix : undefined;
            inputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            inputs["connectionString"] = undefined /*out*/;
            inputs["ipAddress"] = undefined /*out*/;
            inputs["port"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Connection.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <db_cluster_id> + 'tf'.
     */
    readonly connectionPrefix?: pulumi.Input<string>;
    /**
     * Connection cluster string.
     */
    readonly connectionString?: pulumi.Input<string>;
    /**
     * The Id of cluster that can run database.
     */
    readonly dbClusterId?: pulumi.Input<string>;
    /**
     * The ip address of connection string.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * Connection cluster port.
     */
    readonly port?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <db_cluster_id> + 'tf'.
     */
    readonly connectionPrefix?: pulumi.Input<string>;
    /**
     * The Id of cluster that can run database.
     */
    readonly dbClusterId: pulumi.Input<string>;
}
