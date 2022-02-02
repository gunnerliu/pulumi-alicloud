// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * DNS domain can be imported using the id or domain name, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:dns/dnsDomain:DnsDomain example aliyun.com
 * ```
 */
export class DnsDomain extends pulumi.CustomResource {
    /**
     * Get an existing DnsDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DnsDomainState, opts?: pulumi.CustomResourceOptions): DnsDomain {
        return new DnsDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/dnsDomain:DnsDomain';

    /**
     * Returns true if the given object is an instance of DnsDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DnsDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DnsDomain.__pulumiType;
    }

    public /*out*/ readonly dnsServers!: pulumi.Output<string[]>;
    /**
     * The domain ID.
     */
    public /*out*/ readonly domainId!: pulumi.Output<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    public readonly groupId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly groupName!: pulumi.Output<string>;
    /**
     * User language.
     */
    public readonly lang!: pulumi.Output<string | undefined>;
    public /*out*/ readonly punyCode!: pulumi.Output<string>;
    /**
     * Remarks information for your domain name.
     */
    public readonly remark!: pulumi.Output<string | undefined>;
    /**
     * The Id of resource group which the dns domain belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a DnsDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DnsDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DnsDomainArgs | DnsDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DnsDomainState | undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["domainId"] = state ? state.domainId : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupName"] = state ? state.groupName : undefined;
            resourceInputs["lang"] = state ? state.lang : undefined;
            resourceInputs["punyCode"] = state ? state.punyCode : undefined;
            resourceInputs["remark"] = state ? state.remark : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DnsDomainArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["lang"] = args ? args.lang : undefined;
            resourceInputs["remark"] = args ? args.remark : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["dnsServers"] = undefined /*out*/;
            resourceInputs["domainId"] = undefined /*out*/;
            resourceInputs["groupName"] = undefined /*out*/;
            resourceInputs["punyCode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DnsDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DnsDomain resources.
 */
export interface DnsDomainState {
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The domain ID.
     */
    domainId?: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    groupId?: pulumi.Input<string>;
    groupName?: pulumi.Input<string>;
    /**
     * User language.
     */
    lang?: pulumi.Input<string>;
    punyCode?: pulumi.Input<string>;
    /**
     * Remarks information for your domain name.
     */
    remark?: pulumi.Input<string>;
    /**
     * The Id of resource group which the dns domain belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a DnsDomain resource.
 */
export interface DnsDomainArgs {
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    domainName: pulumi.Input<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * User language.
     */
    lang?: pulumi.Input<string>;
    /**
     * Remarks information for your domain name.
     */
    remark?: pulumi.Input<string>;
    /**
     * The Id of resource group which the dns domain belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
