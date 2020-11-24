// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a RAM cloud account alias.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ram.NewAccountAlias(ctx, "alias", &ram.AccountAliasArgs{
// 			AccountAlias: pulumi.String("hallo"),
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
// RAM account alias can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ram/accountAlias:AccountAlias example my-alias
// ```
type AccountAlias struct {
	pulumi.CustomResourceState

	// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
	AccountAlias pulumi.StringOutput `pulumi:"accountAlias"`
}

// NewAccountAlias registers a new resource with the given unique name, arguments, and options.
func NewAccountAlias(ctx *pulumi.Context,
	name string, args *AccountAliasArgs, opts ...pulumi.ResourceOption) (*AccountAlias, error) {
	if args == nil || args.AccountAlias == nil {
		return nil, errors.New("missing required argument 'AccountAlias'")
	}
	if args == nil {
		args = &AccountAliasArgs{}
	}
	var resource AccountAlias
	err := ctx.RegisterResource("alicloud:ram/accountAlias:AccountAlias", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountAlias gets an existing AccountAlias resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountAlias(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountAliasState, opts ...pulumi.ResourceOption) (*AccountAlias, error) {
	var resource AccountAlias
	err := ctx.ReadResource("alicloud:ram/accountAlias:AccountAlias", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountAlias resources.
type accountAliasState struct {
	// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
	AccountAlias *string `pulumi:"accountAlias"`
}

type AccountAliasState struct {
	// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
	AccountAlias pulumi.StringPtrInput
}

func (AccountAliasState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountAliasState)(nil)).Elem()
}

type accountAliasArgs struct {
	// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
	AccountAlias string `pulumi:"accountAlias"`
}

// The set of arguments for constructing a AccountAlias resource.
type AccountAliasArgs struct {
	// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
	AccountAlias pulumi.StringInput
}

func (AccountAliasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountAliasArgs)(nil)).Elem()
}

type AccountAliasInput interface {
	pulumi.Input

	ToAccountAliasOutput() AccountAliasOutput
	ToAccountAliasOutputWithContext(ctx context.Context) AccountAliasOutput
}

func (AccountAlias) ElementType() reflect.Type {
	return reflect.TypeOf((*AccountAlias)(nil)).Elem()
}

func (i AccountAlias) ToAccountAliasOutput() AccountAliasOutput {
	return i.ToAccountAliasOutputWithContext(context.Background())
}

func (i AccountAlias) ToAccountAliasOutputWithContext(ctx context.Context) AccountAliasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountAliasOutput)
}

type AccountAliasOutput struct {
	*pulumi.OutputState
}

func (AccountAliasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccountAliasOutput)(nil)).Elem()
}

func (o AccountAliasOutput) ToAccountAliasOutput() AccountAliasOutput {
	return o
}

func (o AccountAliasOutput) ToAccountAliasOutputWithContext(ctx context.Context) AccountAliasOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AccountAliasOutput{})
}
