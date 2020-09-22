// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type DnsDomain struct {
	pulumi.CustomResourceState

	DnsServers pulumi.StringArrayOutput `pulumi:"dnsServers"`
	// The domain ID.
	DomainId pulumi.StringOutput `pulumi:"domainId"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId   pulumi.StringPtrOutput `pulumi:"groupId"`
	GroupName pulumi.StringOutput    `pulumi:"groupName"`
	// User language.
	Lang     pulumi.StringPtrOutput `pulumi:"lang"`
	PunyCode pulumi.StringOutput    `pulumi:"punyCode"`
	// Remarks information for your domain name.
	Remark pulumi.StringPtrOutput `pulumi:"remark"`
	// The Id of resource group which the dns domain belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewDnsDomain registers a new resource with the given unique name, arguments, and options.
func NewDnsDomain(ctx *pulumi.Context,
	name string, args *DnsDomainArgs, opts ...pulumi.ResourceOption) (*DnsDomain, error) {
	if args == nil || args.DomainName == nil {
		return nil, errors.New("missing required argument 'DomainName'")
	}
	if args == nil {
		args = &DnsDomainArgs{}
	}
	var resource DnsDomain
	err := ctx.RegisterResource("alicloud:dns/dnsDomain:DnsDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDnsDomain gets an existing DnsDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDnsDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DnsDomainState, opts ...pulumi.ResourceOption) (*DnsDomain, error) {
	var resource DnsDomain
	err := ctx.ReadResource("alicloud:dns/dnsDomain:DnsDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DnsDomain resources.
type dnsDomainState struct {
	DnsServers []string `pulumi:"dnsServers"`
	// The domain ID.
	DomainId *string `pulumi:"domainId"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName *string `pulumi:"domainName"`
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId   *string `pulumi:"groupId"`
	GroupName *string `pulumi:"groupName"`
	// User language.
	Lang     *string `pulumi:"lang"`
	PunyCode *string `pulumi:"punyCode"`
	// Remarks information for your domain name.
	Remark *string `pulumi:"remark"`
	// The Id of resource group which the dns domain belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
}

type DnsDomainState struct {
	DnsServers pulumi.StringArrayInput
	// The domain ID.
	DomainId pulumi.StringPtrInput
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringPtrInput
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId   pulumi.StringPtrInput
	GroupName pulumi.StringPtrInput
	// User language.
	Lang     pulumi.StringPtrInput
	PunyCode pulumi.StringPtrInput
	// Remarks information for your domain name.
	Remark pulumi.StringPtrInput
	// The Id of resource group which the dns domain belongs.
	ResourceGroupId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
}

func (DnsDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsDomainState)(nil)).Elem()
}

type dnsDomainArgs struct {
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName string `pulumi:"domainName"`
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId *string `pulumi:"groupId"`
	// User language.
	Lang *string `pulumi:"lang"`
	// Remarks information for your domain name.
	Remark *string `pulumi:"remark"`
	// The Id of resource group which the dns domain belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a DnsDomain resource.
type DnsDomainArgs struct {
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringInput
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId pulumi.StringPtrInput
	// User language.
	Lang pulumi.StringPtrInput
	// Remarks information for your domain name.
	Remark pulumi.StringPtrInput
	// The Id of resource group which the dns domain belongs.
	ResourceGroupId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
}

func (DnsDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsDomainArgs)(nil)).Elem()
}
