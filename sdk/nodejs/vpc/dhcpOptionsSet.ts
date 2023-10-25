// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a VPC Dhcp Options Set resource. DHCP option set.
 *
 * For information about VPC Dhcp Options Set and how to use it, see [What is Dhcp Options Set](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/dhcp-options-sets-overview).
 *
 * > **NOTE:** Available since v1.134.0.
 *
 * ## Import
 *
 * VPC Dhcp Options Set can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet example <id>
 * ```
 */
export class DhcpOptionsSet extends pulumi.CustomResource {
    /**
     * Get an existing DhcpOptionsSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DhcpOptionsSetState, opts?: pulumi.CustomResourceOptions): DhcpOptionsSet {
        return new DhcpOptionsSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet';

    /**
     * Returns true if the given object is an instance of DhcpOptionsSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DhcpOptionsSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DhcpOptionsSet.__pulumiType;
    }

    /**
     * Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. See `associateVpcs` below.
     *
     * @deprecated Field 'associate_vpcs' has been deprecated from provider version 1.211.0. Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc.
     */
    public readonly associateVpcs!: pulumi.Output<outputs.vpc.DhcpOptionsSetAssociateVpc[]>;
    /**
     * The description can be blank or contain 1 to 256 characters. It must start with a letter or Chinese character but cannot start with http:// or https://.
     */
    public readonly dhcpOptionsSetDescription!: pulumi.Output<string | undefined>;
    /**
     * The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
     */
    public readonly dhcpOptionsSetName!: pulumi.Output<string | undefined>;
    /**
     * The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
     */
    public readonly domainName!: pulumi.Output<string | undefined>;
    /**
     * The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are 100.100.2.136 and 100.100.2.138.
     */
    public readonly domainNameServers!: pulumi.Output<string | undefined>;
    /**
     * Whether to PreCheck only this request, value:
     * - **true**: sends a check request and does not delete the DHCP option set. Check items include whether required parameters are filled in, request format, and restrictions. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
     * - **false** (default): Sends a normal request and directly deletes the DHCP option set after checking.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The lease time of the IPv6 DHCP option set.When the lease time is set to hours: Unit: h. Value range: 24h ~ 1176h,87600h ~ 175200h. Default value: 87600h.When the lease time is set to day: Unit: d. Value range: 1d ~ 49d,3650d ~ 7300d. Default value: 3650d.
     */
    public readonly ipv6LeaseTime!: pulumi.Output<string>;
    /**
     * The lease time of the IPv4 DHCP option set.When the lease time is set to hours: Unit: h. Value range: 24h ~ 1176h,87600h ~ 175200h. Default value: 87600h.When the lease time is set to day: Unit: d. Value range: 1d ~ 49d,3650d ~ 7300d. Default value: 3650d.
     */
    public readonly leaseTime!: pulumi.Output<string>;
    /**
     * The ID of the account to which the DHCP options set belongs.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<number>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Tags of the current resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a DhcpOptionsSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DhcpOptionsSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DhcpOptionsSetArgs | DhcpOptionsSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DhcpOptionsSetState | undefined;
            resourceInputs["associateVpcs"] = state ? state.associateVpcs : undefined;
            resourceInputs["dhcpOptionsSetDescription"] = state ? state.dhcpOptionsSetDescription : undefined;
            resourceInputs["dhcpOptionsSetName"] = state ? state.dhcpOptionsSetName : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["domainNameServers"] = state ? state.domainNameServers : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["ipv6LeaseTime"] = state ? state.ipv6LeaseTime : undefined;
            resourceInputs["leaseTime"] = state ? state.leaseTime : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DhcpOptionsSetArgs | undefined;
            resourceInputs["associateVpcs"] = args ? args.associateVpcs : undefined;
            resourceInputs["dhcpOptionsSetDescription"] = args ? args.dhcpOptionsSetDescription : undefined;
            resourceInputs["dhcpOptionsSetName"] = args ? args.dhcpOptionsSetName : undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["domainNameServers"] = args ? args.domainNameServers : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["ipv6LeaseTime"] = args ? args.ipv6LeaseTime : undefined;
            resourceInputs["leaseTime"] = args ? args.leaseTime : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DhcpOptionsSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DhcpOptionsSet resources.
 */
export interface DhcpOptionsSetState {
    /**
     * Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. See `associateVpcs` below.
     *
     * @deprecated Field 'associate_vpcs' has been deprecated from provider version 1.211.0. Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc.
     */
    associateVpcs?: pulumi.Input<pulumi.Input<inputs.vpc.DhcpOptionsSetAssociateVpc>[]>;
    /**
     * The description can be blank or contain 1 to 256 characters. It must start with a letter or Chinese character but cannot start with http:// or https://.
     */
    dhcpOptionsSetDescription?: pulumi.Input<string>;
    /**
     * The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
     */
    dhcpOptionsSetName?: pulumi.Input<string>;
    /**
     * The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are 100.100.2.136 and 100.100.2.138.
     */
    domainNameServers?: pulumi.Input<string>;
    /**
     * Whether to PreCheck only this request, value:
     * - **true**: sends a check request and does not delete the DHCP option set. Check items include whether required parameters are filled in, request format, and restrictions. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
     * - **false** (default): Sends a normal request and directly deletes the DHCP option set after checking.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The lease time of the IPv6 DHCP option set.When the lease time is set to hours: Unit: h. Value range: 24h ~ 1176h,87600h ~ 175200h. Default value: 87600h.When the lease time is set to day: Unit: d. Value range: 1d ~ 49d,3650d ~ 7300d. Default value: 3650d.
     */
    ipv6LeaseTime?: pulumi.Input<string>;
    /**
     * The lease time of the IPv4 DHCP option set.When the lease time is set to hours: Unit: h. Value range: 24h ~ 1176h,87600h ~ 175200h. Default value: 87600h.When the lease time is set to day: Unit: d. Value range: 1d ~ 49d,3650d ~ 7300d. Default value: 3650d.
     */
    leaseTime?: pulumi.Input<string>;
    /**
     * The ID of the account to which the DHCP options set belongs.
     */
    ownerId?: pulumi.Input<number>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * Tags of the current resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a DhcpOptionsSet resource.
 */
export interface DhcpOptionsSetArgs {
    /**
     * Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. See `associateVpcs` below.
     *
     * @deprecated Field 'associate_vpcs' has been deprecated from provider version 1.211.0. Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc.
     */
    associateVpcs?: pulumi.Input<pulumi.Input<inputs.vpc.DhcpOptionsSetAssociateVpc>[]>;
    /**
     * The description can be blank or contain 1 to 256 characters. It must start with a letter or Chinese character but cannot start with http:// or https://.
     */
    dhcpOptionsSetDescription?: pulumi.Input<string>;
    /**
     * The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
     */
    dhcpOptionsSetName?: pulumi.Input<string>;
    /**
     * The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are 100.100.2.136 and 100.100.2.138.
     */
    domainNameServers?: pulumi.Input<string>;
    /**
     * Whether to PreCheck only this request, value:
     * - **true**: sends a check request and does not delete the DHCP option set. Check items include whether required parameters are filled in, request format, and restrictions. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.
     * - **false** (default): Sends a normal request and directly deletes the DHCP option set after checking.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The lease time of the IPv6 DHCP option set.When the lease time is set to hours: Unit: h. Value range: 24h ~ 1176h,87600h ~ 175200h. Default value: 87600h.When the lease time is set to day: Unit: d. Value range: 1d ~ 49d,3650d ~ 7300d. Default value: 3650d.
     */
    ipv6LeaseTime?: pulumi.Input<string>;
    /**
     * The lease time of the IPv4 DHCP option set.When the lease time is set to hours: Unit: h. Value range: 24h ~ 1176h,87600h ~ 175200h. Default value: 87600h.When the lease time is set to day: Unit: d. Value range: 1d ~ 49d,3650d ~ 7300d. Default value: 3650d.
     */
    leaseTime?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Tags of the current resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
