package gift.dto.response;

import gift.domain.Option;

public record OptionResponse(Long id, String name, int quantity) {
    public static OptionResponse from(final Option option){
        return new OptionResponse(option.getId(), option.getName(), option.getQuantity());
    }
}