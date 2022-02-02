// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a PolarDB database resource. A database deployed in a PolarDB cluster. A PolarDB cluster can own multiple databases.
 *
 * > **NOTE:** Available in v1.66.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "polardbClusterconfig";
 * const creation = config.get("creation") || "PolarDB";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: creation,
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/16"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?[0]?.id),
 * });
 * const cluster = new alicloud.polardb.Cluster("cluster", {
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     payType: "PostPaid",
 *     dbNodeClass: "polar.mysql.x4.large",
 *     vswitchId: defaultSwitch.id,
 *     description: "testDB",
 * });
 * const defaultDatabase = new alicloud.polardb.Database("defaultDatabase", {
 *     dbClusterId: cluster.id,
 *     dbName: "tftestdatabase",
 * });
 * ```
 *
 * ## Import
 *
 * PolarDB database can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:polardb/database:Database example "pc-12345:tf_database"
 * ```
 */
export class Database extends pulumi.CustomResource {
    /**
     * Get an existing Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseState, opts?: pulumi.CustomResourceOptions): Database {
        return new Database(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:polardb/database:Database';

    /**
     * Returns true if the given object is an instance of Database.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Database {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Database.__pulumiType;
    }

    /**
     * Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \(`utf8mb4` only supports versions 5.5 and 5.6\).
     */
    public readonly characterSetName!: pulumi.Output<string | undefined>;
    /**
     * The Id of cluster that can run database.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
     */
    public readonly dbDescription!: pulumi.Output<string | undefined>;
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
     */
    public readonly dbName!: pulumi.Output<string>;

    /**
     * Create a Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseArgs | DatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseState | undefined;
            resourceInputs["characterSetName"] = state ? state.characterSetName : undefined;
            resourceInputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            resourceInputs["dbDescription"] = state ? state.dbDescription : undefined;
            resourceInputs["dbName"] = state ? state.dbName : undefined;
        } else {
            const args = argsOrState as DatabaseArgs | undefined;
            if ((!args || args.dbClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterId'");
            }
            if ((!args || args.dbName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbName'");
            }
            resourceInputs["characterSetName"] = args ? args.characterSetName : undefined;
            resourceInputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            resourceInputs["dbDescription"] = args ? args.dbDescription : undefined;
            resourceInputs["dbName"] = args ? args.dbName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Database.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Database resources.
 */
export interface DatabaseState {
    /**
     * Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \(`utf8mb4` only supports versions 5.5 and 5.6\).
     */
    characterSetName?: pulumi.Input<string>;
    /**
     * The Id of cluster that can run database.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
     */
    dbDescription?: pulumi.Input<string>;
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
     */
    dbName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    /**
     * Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \(`utf8mb4` only supports versions 5.5 and 5.6\).
     */
    characterSetName?: pulumi.Input<string>;
    /**
     * The Id of cluster that can run database.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
     */
    dbDescription?: pulumi.Input<string>;
    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
     */
    dbName: pulumi.Input<string>;
}
