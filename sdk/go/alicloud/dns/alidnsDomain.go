// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Alidns domain resource.
//
// > **NOTE:** The domain name which you want to add must be already registered and had not added by another account. Every domain name can only exist in a unique group.
//
// > **NOTE:** Available in v1.95.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/dns"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := dns.NewAlidnsDomain(ctx, "dns", &dns.AlidnsDomainArgs{
// 			DomainName: pulumi.String("starmove.com"),
// 			GroupId:    pulumi.String("85ab8713-4a30-4de4-9d20-155ff830****"),
// 			Tags: pulumi.StringMap{
// 				"Created":     pulumi.String("Terraform"),
// 				"Environment": pulumi.String("test"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Alidns domain can be imported using the id or domain name, e.g.
//
// ```sh
//  $ pulumi import alicloud:dns/alidnsDomain:AlidnsDomain example aliyun.com
// ```
type AlidnsDomain struct {
	pulumi.CustomResourceState

	DnsServers pulumi.StringArrayOutput `pulumi:"dnsServers"`
	// The domain ID.
	DomainId pulumi.StringOutput `pulumi:"domainId"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId pulumi.StringPtrOutput `pulumi:"groupId"`
	// Domain name group name.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// User language.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// Only return punycode codes for Chinese domain names.
	PunyCode pulumi.StringOutput `pulumi:"punyCode"`
	// Remarks information for your domain name.
	Remark pulumi.StringPtrOutput `pulumi:"remark"`
	// The Id of resource group which the dns domain belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewAlidnsDomain registers a new resource with the given unique name, arguments, and options.
func NewAlidnsDomain(ctx *pulumi.Context,
	name string, args *AlidnsDomainArgs, opts ...pulumi.ResourceOption) (*AlidnsDomain, error) {
	if args == nil || args.DomainName == nil {
		return nil, errors.New("missing required argument 'DomainName'")
	}
	if args == nil {
		args = &AlidnsDomainArgs{}
	}
	var resource AlidnsDomain
	err := ctx.RegisterResource("alicloud:dns/alidnsDomain:AlidnsDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlidnsDomain gets an existing AlidnsDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlidnsDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlidnsDomainState, opts ...pulumi.ResourceOption) (*AlidnsDomain, error) {
	var resource AlidnsDomain
	err := ctx.ReadResource("alicloud:dns/alidnsDomain:AlidnsDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlidnsDomain resources.
type alidnsDomainState struct {
	DnsServers []string `pulumi:"dnsServers"`
	// The domain ID.
	DomainId *string `pulumi:"domainId"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName *string `pulumi:"domainName"`
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId *string `pulumi:"groupId"`
	// Domain name group name.
	GroupName *string `pulumi:"groupName"`
	// User language.
	Lang *string `pulumi:"lang"`
	// Only return punycode codes for Chinese domain names.
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

type AlidnsDomainState struct {
	DnsServers pulumi.StringArrayInput
	// The domain ID.
	DomainId pulumi.StringPtrInput
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringPtrInput
	// Id of the group in which the domain will add. If not supplied, then use default group.
	GroupId pulumi.StringPtrInput
	// Domain name group name.
	GroupName pulumi.StringPtrInput
	// User language.
	Lang pulumi.StringPtrInput
	// Only return punycode codes for Chinese domain names.
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

func (AlidnsDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*alidnsDomainState)(nil)).Elem()
}

type alidnsDomainArgs struct {
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

// The set of arguments for constructing a AlidnsDomain resource.
type AlidnsDomainArgs struct {
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

func (AlidnsDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alidnsDomainArgs)(nil)).Elem()
}

type AlidnsDomainInput interface {
	pulumi.Input

	ToAlidnsDomainOutput() AlidnsDomainOutput
	ToAlidnsDomainOutputWithContext(ctx context.Context) AlidnsDomainOutput
}

func (AlidnsDomain) ElementType() reflect.Type {
	return reflect.TypeOf((*AlidnsDomain)(nil)).Elem()
}

func (i AlidnsDomain) ToAlidnsDomainOutput() AlidnsDomainOutput {
	return i.ToAlidnsDomainOutputWithContext(context.Background())
}

func (i AlidnsDomain) ToAlidnsDomainOutputWithContext(ctx context.Context) AlidnsDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsDomainOutput)
}

type AlidnsDomainOutput struct {
	*pulumi.OutputState
}

func (AlidnsDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlidnsDomainOutput)(nil)).Elem()
}

func (o AlidnsDomainOutput) ToAlidnsDomainOutput() AlidnsDomainOutput {
	return o
}

func (o AlidnsDomainOutput) ToAlidnsDomainOutputWithContext(ctx context.Context) AlidnsDomainOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AlidnsDomainOutput{})
}
